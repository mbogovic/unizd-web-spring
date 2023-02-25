package hr.unizd.web.spring;

import java.util.List;

public class MemoryReader {

    private List<String> memoryData = List.of("Sadržaj iz memorije");

    public String readData() {
        return memoryData.toString();
    }
}
