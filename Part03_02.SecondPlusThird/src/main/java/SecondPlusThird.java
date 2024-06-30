
import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> myList = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            
            myList.add(number);
        }
        //sum the second and third element in the ArrayList
        int elem2 = myList.get(1);
        int elem3 = myList.get(2);
        System.out.println(elem2 + elem3);
    }
}
