package hr.unizd.web.spring;

import java.util.List;

public class MemoryReader implements Reader {
    private List<String> memoryDataList;

    public String read() {
        return memoryDataList.toString();
    }

    public void setMemoryDataList(List<String> memoryDataList) {
        this.memoryDataList = memoryDataList;
    }
}
