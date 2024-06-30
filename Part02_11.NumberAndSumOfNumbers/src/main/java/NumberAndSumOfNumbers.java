
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cont = 0; 
        int suma = 0; 
        
        while(true){
            System.out.println("Give a number:");
            int num = scanner.nextInt();
            
            if(num == 0){
                break;
            }else{
                suma += num;
                cont++;
            }
        }
        System.out.println("Number of numbers: "+cont);
        System.out.println("Sum of the numbers: "+suma);
        
        
    }
}
