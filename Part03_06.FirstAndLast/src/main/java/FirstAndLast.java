
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cont = 0;

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("") && cont >= 2) {
                break;
            }
            cont++;
            list.add(input);
        }
        int num = list.size() - 1;
        System.out.println(list.get(0));
        System.out.println(list.get(num));
    }
}
