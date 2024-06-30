
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cont = 0;
        int suma = 0;
        
        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            if(num == 0){
                break;    
            }
            if(num != 0){
                suma += num;
                cont++;
            }
        }
        double average = (double)suma/(double)cont;
        System.out.println("Average of the numbers: "+average);
    }
}
