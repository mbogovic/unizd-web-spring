package hr.unizd.web.spring;

public class DataReaderClient {
    private Reader reader;

    public DataReaderClient(Reader reader) {
        this.reader = reader;
    }

    public String fetchData() {
        return reader.read();
    }


}
