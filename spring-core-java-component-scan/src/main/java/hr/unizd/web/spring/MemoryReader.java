package hr.unizd.web.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("prototype")
public class MemoryReader implements Reader {
    private List<String> memoryDataList = List.of("Ovo je iz memorije - java 1", "Ovo je iz memorije - java 2");

    public String read() {
        return memoryDataList.toString();
    }

    public void setMemoryDataList(List<String> memoryDataList) {
        this.memoryDataList = memoryDataList;
    }
}
