import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CSVFileReader {

    public static void main(String[] args) throws Exception {
        File file = new File("file.csv");
        Scanner scanner = new Scanner(new InputStreamReader(new FileInputStream(file), "UTF-8"));

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] fields = line.split(",");
            for (String field : fields) {
                System.out.println(field);
            }
        }

        scanner.close();
    }
}
