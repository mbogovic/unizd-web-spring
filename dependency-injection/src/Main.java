import hr.unizd.web.spring.DataReaderClient;
import hr.unizd.web.spring.FileReader;
import hr.unizd.web.spring.MemoryReader;
import hr.unizd.web.spring.Reader;

public class Main {

    public static void main(String[] args) {
        Reader fileReader = new FileReader("");
        Reader memoryReader = new MemoryReader();
        DataReaderClient dataReaderClient = new DataReaderClient(fileReader);

        System.out.println("-----------------------");
        System.out.println("Ispisujem tražene podatke : \n" + dataReaderClient.fetchData());
        System.out.println("-----------------------");
    }
}