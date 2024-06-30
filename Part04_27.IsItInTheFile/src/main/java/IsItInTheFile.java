
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        try{
            boolean found = isItInFile(file, searchedFor);
            if(found){
                System.out.println("Found");
            }else{
                System.out.println("Not found");
            }
        }catch(Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }
    }
    
    public static boolean isItInFile(String file, String name) throws IOException{
        for(String line : Files.readAllLines(Paths.get(file))){
            if(line.equals(name)){
                return true;
            }
        }
        return false;
    }
}
