
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!(input.equals(""))) {
            String[] pieces = input.split(" ");
            System.out.println(pieces[pieces.length - 1]);
            input = scanner.nextLine();
        }
    }
}
