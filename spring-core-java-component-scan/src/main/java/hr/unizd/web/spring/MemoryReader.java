package hr.unizd.web.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("prototype")
public class MemoryReader implements Reader {
    private List<String> memoryDataList = List.of("Ovo je iz memorije - java 1", "Ovo je iz memorije - java 2");
    private final String SOURCE_OF_DATA = "Memorija";

    @Override
    public String read() {
        return memoryDataList.toString();
    }

    @Override
    public String getSourceOfData() {
        return SOURCE_OF_DATA;
    }

}
