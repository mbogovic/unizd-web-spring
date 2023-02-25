package hr.unizd.web.spring;

public class DataReaderClient {
    private FileReader fileReader;

    public DataReaderClient(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    public String fetchData() {
        return fileReader.read();
    }


}
