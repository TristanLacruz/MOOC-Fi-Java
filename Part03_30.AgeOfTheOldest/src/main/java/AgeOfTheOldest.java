
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int max = Integer.MIN_VALUE;

        while (!(input.equals(""))) {
            String[] pieces = input.split(",");
            for (int i = 1; i < pieces.length; i++) {
                if (max < Integer.valueOf(pieces[i])) {
                    max = Integer.valueOf(pieces[i]);
                }

            }
            input = scanner.nextLine();
        }
        System.out.println("Age of the oldest: " + max);

    }
}
