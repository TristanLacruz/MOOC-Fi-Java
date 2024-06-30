
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont = 0;
        
        while(true){
            System.out.println("Give a number:");
            int num = scanner.nextInt();
            
            if(num > 0){
                continue;
            }else if(num < 0){
                cont++;
                continue;
            }else if(num == 0){
                break;
            }
        }
        System.out.println("Number of negative numbers: "+cont);
    }
}
