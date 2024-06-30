
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String caracteres = scan.nextLine();
        System.out.println("Give an integer:");
        int entero = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double decimal = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean verdadero = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string "+caracteres);
        System.out.println("You gave the integer "+entero);
        System.out.println("You gave the double "+decimal);
        System.out.println("You gave the boolean "+verdadero);
    }
}
