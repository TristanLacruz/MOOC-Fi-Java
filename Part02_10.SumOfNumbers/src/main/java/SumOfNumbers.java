
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        
        while(true){
            System.out.println("Give a number:");
            int num = scanner.nextInt();
            
            if(num == 0){
                break;
            }else if(num != 0){
                suma += num;
                continue;
            }
        }
        System.out.println("Sum of the numbers: "+suma);
    }
}
