import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 
 
public class ScannerDemo {
    public static void main(String[] args) throws FileNotFoundException {
        File readFile = new File("input.txt");
        Scanner scan = new Scanner(readFile);
        if (scan.hasNext()) {
            System.out.println(scan.nextLine());
        }
    }
}