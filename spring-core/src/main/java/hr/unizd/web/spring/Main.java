package hr.unizd.web.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //Kreiramo aplikacijski context/spring container
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        DataReaderClient fileDataReaderClient = context.getBean("fileDataReaderClient", DataReaderClient.class);
        DataReaderClient fileDataReaderClient2 = context.getBean("fileDataReaderClient2", DataReaderClient.class);
        DataReaderClient memoryDataReaderClient = context.getBean("memoryDataReaderClient", DataReaderClient.class);
        DataReaderClient memoryDataReaderClient2 = context.getBean("memoryDataReaderClient2", DataReaderClient.class);

        System.out.println("-----------------------");
        System.out.println("Ispisujem tražene podatke fileDataReaderClient: \n" + fileDataReaderClient.fetchData());
        System.out.println("-----------------------");
        System.out.println("Ispisujem tražene podatke fileDataReaderClient2: \n" + fileDataReaderClient2.fetchData());
        System.out.println("-----------------------");
        System.out.println("Ispisujem tražene podatke memoryDataReaderClient: \n" + memoryDataReaderClient.fetchData());
        System.out.println("-----------------------");
        System.out.println("Ispisujem tražene podatke memoryDataReaderClient2: \n" + memoryDataReaderClient2.fetchData());
        System.out.println("-----------------------");
    }
}