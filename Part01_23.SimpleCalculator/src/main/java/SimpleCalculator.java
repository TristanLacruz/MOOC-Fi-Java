
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        int suma = num1+num2;
        int resta = num1-num2;
        int multi = num1*num2;
        double n1 = Double.valueOf(num1);
        double n2 = Double.valueOf(num2);
        double divi = n1/n2;
        System.out.println(num1+" + "+num2+" = "+suma);
        System.out.println(num1+" - "+num2+" = "+resta);
        System.out.println(num1+" * "+num2+" = "+multi);
        System.out.println(num1+" / "+num2+" = "+divi);
    }
}
