package hr.unizd.web.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Component
@Primary
public class FileReader implements Reader {
    private final String SOURCE_OF_DATA = "Datoteka";

    private Path filePath;

    public FileReader(@Value("${file.reader.file.path}") String fileName) {
        filePath = Paths.get(fileName);
    }

    @Override
    public String read() {
        String content = "";
        try {
            List<String> allLines = Files.readAllLines(filePath, StandardCharsets.UTF_8);
            content = allLines.toString();
        } catch (IOException e) {
            System.out.println("Can't read file: " + e);
        }

        return content;
    }

    @Override
    public String getSourceOfData() {
        return SOURCE_OF_DATA;
    }
}
