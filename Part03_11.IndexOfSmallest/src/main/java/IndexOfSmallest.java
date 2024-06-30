
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        ArrayList<Integer> miLista = new ArrayList<>();
        while (true) {
            int num = scanner.nextInt();
            miLista.add(num);
            if (num == 9999) {
                break;
            }
        }
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i <= miLista.size() - 1; i++) {
            if (miLista.get(i) < smallest) {
                smallest = miLista.get(i);
            }
        }
        System.out.println("Smallest number: " + smallest);
        for (int i = 0; i <= miLista.size() - 1; i++) {
            if (smallest == miLista.get(i)) {
                System.out.println("Found at index: " + i);
            }
        }
        
    }
}
