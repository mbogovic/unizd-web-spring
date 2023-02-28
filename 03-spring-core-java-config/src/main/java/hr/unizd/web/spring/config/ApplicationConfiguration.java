package hr.unizd.web.spring.config;

import hr.unizd.web.spring.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
public class ApplicationConfiguration {

    @Bean
    @Primary
    public Reader fileReader() {
        FileReader fileReader = new FileReader("");
        return fileReader;
    }

    @Bean
    @Scope("prototype")
    public Reader memoryReader() {
        MemoryReader memoryReader = new MemoryReader();
        memoryReader.setMemoryDataList(
                List.of("Ovo je iz memorije - java 1", "Ovo je iz memorije - java 2")
        );

        return memoryReader;
    }

    @Bean
    @Autowired
    public DataReaderClient dataReaderClient(Reader reader) {
        DataReaderClient dataReaderClient = new DataReaderClient(reader);
        dataReaderClient.setSourceOfData("datoteka");

        return dataReaderClient;
    }

    @Bean
    @Autowired
    public SourceAnalyzer sourceAnalyzer(DataReaderClient dataReaderClient) {
        SourceAnalyzer sourceAnalyzer = new SourceAnalyzer();
        sourceAnalyzer.setDataReaderClient(dataReaderClient);

        return sourceAnalyzer;
    }

}
