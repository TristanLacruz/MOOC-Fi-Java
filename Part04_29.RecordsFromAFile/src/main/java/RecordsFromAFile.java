
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        printData(file);
    }
    
    public static void printData(String file) throws IOException{
        Scanner scanner = new Scanner(Paths.get(file));
        
        String line;
        while(scanner.hasNext()){
            line = scanner.nextLine();
            
            if(line.equals("")){
                break;
            }
            
            String[] parts = line.split(",");
            
            System.out.println(parts[0] + ", age: " + parts[1] + " years");
        }
    }
}
