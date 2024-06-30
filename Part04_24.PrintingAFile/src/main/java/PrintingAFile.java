
import java.io.BufferedReader;
import java.io.FileReader;

import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        
        BufferedReader br = null;
        
        try (
            Scanner scanner = new Scanner(Paths.get("data.txt"))) {

            /*
            Solamente con esto funcionaría
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }
            */

            br = new BufferedReader(new FileReader("data.txt"));
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally{
            try{
                br.close();
            }catch(Exception ex){
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }
}
