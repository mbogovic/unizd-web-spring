package hr.unizd.web.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataReaderClient {

    private Reader reader;

    @Autowired
    public DataReaderClient(Reader reader) {
        this.reader = reader;
    }

    public String fetchData() {
        return reader.read();
    }

    public String getSourceOfData() {
        return reader.getSourceOfData();
    }
}
