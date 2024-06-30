
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int max = Integer.MIN_VALUE;
        String name = "";

        while (!(input.equals(""))) {
            String[] pieces = input.split(",");
            for (int i = 1; i < pieces.length; i++) {
                if (max < Integer.valueOf(pieces[i])) {
                    max = Integer.valueOf(pieces[i]);
                    name = pieces[i - 1];
                }
            }
            input = scanner.nextLine();
        }
        System.out.println("Name of the oldest: " + name);
    }
}
