package hr.unizd.web.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //Kreiramo aplikacijski context/spring container
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        DataReaderClient dataReaderClient = context.getBean("dataReaderClient", DataReaderClient.class);

        System.out.println("-----------------------");
        System.out.println("Ispisujem tražene podatke : \n" + dataReaderClient.fetchData());
        System.out.println("-----------------------");
    }
}