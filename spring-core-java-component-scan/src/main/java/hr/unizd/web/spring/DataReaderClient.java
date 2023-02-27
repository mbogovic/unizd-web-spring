package hr.unizd.web.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DataReaderClient {

    @Value("datoteka")
    private String sourceOfData;

    private Reader reader;

    @Autowired
    public DataReaderClient(Reader reader) {
        this.reader = reader;
    }

    public String fetchData() {
        return reader.read();
    }

    public String getSourceOfData() {
        return sourceOfData;
    }

    public void setSourceOfData(String sourceOfData) {
        this.sourceOfData = sourceOfData;
    }
}
