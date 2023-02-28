package hr.unizd.web.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SourceAnalyzer {

    private DataReaderClient dataReaderClient;

    @Autowired
    public SourceAnalyzer(DataReaderClient dataReaderClient) {
        this.dataReaderClient = dataReaderClient;
    }

    public void logSource() {
        System.out.println("Data comes from: " + this.dataReaderClient.getSourceOfData());
    }

}
