package hr.unizd.web.spring;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReader implements Reader {

    private final String DEFAULT_FILE_NAME = "C:\\Dev\\unizd\\dependency-injection\\src\\test.txt";

    private Path filePath;

    public FileReader(String fileName) {
        filePath = Paths.get(fileName.isBlank() ? DEFAULT_FILE_NAME : fileName);
    }

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

}
