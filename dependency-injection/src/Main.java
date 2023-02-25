import hr.unizd.web.spring.DataReaderClient;
import hr.unizd.web.spring.FileReader;

public class Main {

    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        DataReaderClient dataReaderClient = new DataReaderClient(fileReader);

        System.out.println("-----------------------");
        System.out.println("Ispisujem tražene podatke : \n" + dataReaderClient.fetchData());
        System.out.println("-----------------------");
    }
}