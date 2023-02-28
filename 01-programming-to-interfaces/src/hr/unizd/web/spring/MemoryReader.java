package hr.unizd.web.spring;

import java.util.List;

public class MemoryReader implements Reader {

    private List<String> memoryData = List.of("Ovo je iz memorije.");

    public String read() {
        return memoryData.toString();
    }
}
