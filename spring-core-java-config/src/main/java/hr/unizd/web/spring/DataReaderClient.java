package hr.unizd.web.spring;

public class DataReaderClient {

    private String sourceOfData;
    private Reader reader;

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
