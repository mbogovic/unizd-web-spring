package hr.unizd.web.spring;

public class SourceAnalyzer {

    private DataReaderClient dataReaderClient;

    public void logSource() {
        System.out.println("Data comes from: " + this.dataReaderClient.getSourceOfData());
    }

    public void setDataReaderClient(DataReaderClient dataReaderClient) {
        this.dataReaderClient = dataReaderClient;
    }
}
