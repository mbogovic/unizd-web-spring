package hr.unizd.web.spring;

import hr.unizd.web.spring.config.ApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        DataReaderClient fileDataReaderClient = context.getBean("dataReaderClient", DataReaderClient.class);
        SourceAnalyzer sourceAnalyzer = context.getBean("sourceAnalyzer", SourceAnalyzer.class);

        System.out.println("-----------------------");
        System.out.println("Ispisujem tražene podatke fileDataReaderClient: \n" + fileDataReaderClient.fetchData());
        System.out.println("-----------------------");
        sourceAnalyzer.logSource();
    }
}