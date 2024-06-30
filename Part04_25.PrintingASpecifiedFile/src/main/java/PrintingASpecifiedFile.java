
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String input;
            input = scanner.nextLine();
            scanner = new Scanner(Paths.get(input));

            while (scanner.hasNextLine()) {
                String fila = scanner.nextLine();
                System.out.println(fila);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
