package hr.unizd.web.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SourceAnalyzer {

    @Autowired
    private DataReaderClient dataReaderClient;

    public void logSource() {
        System.out.println("Data comes from: " + this.dataReaderClient.getSourceOfData());
    }

    public void setDataReaderClient(DataReaderClient dataReaderClient) {
        this.dataReaderClient = dataReaderClient;
    }
}
