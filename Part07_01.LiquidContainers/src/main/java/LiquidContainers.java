
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;
        int capacity = 100;

        while (true) {
            System.out.println("First: " + firstContainer + "/" + capacity);
            System.out.println("Second: " + secondContainer + "/" + capacity);

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            if (input.equals("quit")) {
                break;
            }

            String command = parts[0];
            int liquid = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                if (firstContainer + liquid > capacity) {
                    firstContainer = capacity;
                } else if (liquid > 0) {
                    firstContainer += liquid;
                }

            }

            if (command.equals("move")) {
                if (liquid + secondContainer > capacity) {
                    firstContainer -= liquid;
                    secondContainer = capacity;
                } else if (liquid > firstContainer) {
                    secondContainer += firstContainer;
                    firstContainer = 0;
                } else if (liquid > 0) {
                    secondContainer += liquid;
                    firstContainer -= liquid;
                }
                if (secondContainer > capacity) {
                    secondContainer = capacity;
                }
                if (firstContainer < 0) {
                    firstContainer = 0;
                }
            }

            if (command.equals("remove")) {
                if (liquid > secondContainer) {
                    secondContainer = 0;
                } else if (liquid > 0) {
                    secondContainer -= liquid;
                }
            }
        }
    }
}
