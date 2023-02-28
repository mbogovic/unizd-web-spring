package hr.unizd.web.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //Kreiramo aplikacijski context/spring container
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        DataReaderClient fileDataReaderClient = context.getBean("fileDataReaderClient", DataReaderClient.class);
        SourceAnalyzer sourceAnalyzer = context.getBean("sourceAnalyzer", SourceAnalyzer.class);

        System.out.println("-----------------------");
        System.out.println("Ispisujem tražene podatke fileDataReaderClient: \n" + fileDataReaderClient.fetchData());
        System.out.println("-----------------------");
        sourceAnalyzer.logSource();
    }
}