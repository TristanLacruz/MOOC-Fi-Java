
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int number = howManyNumbers(file, lowerBound, upperBound);
        System.out.println("Numbers: " + number);
    }
    
    public static int howManyNumbers(String file, int lower, int higher) throws IOException{
        
        Scanner scanner = new Scanner(Paths.get(file));
        
        int number;
        int cont = 0;
        while(scanner.hasNext()){
            number = Integer.valueOf(scanner.nextLine());
            if(number >= lower && number <= higher){
                cont++;
            }
        }
        return cont;
    }

}
