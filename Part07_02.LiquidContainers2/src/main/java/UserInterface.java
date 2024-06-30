

import java.util.Scanner;

/**
 *
 * @author trist
 */
public class UserInterface {

    Scanner scanner;

    private Container firstC;
    private Container secondC;

    public UserInterface(Scanner scanner, Container firstContainer, Container secondContainer) {
        this.scanner = scanner;
        this.firstC = firstContainer;
        this.secondC = secondContainer;
    }

    public void start() {

        boolean running = true;
        while (running) {
            System.out.println("First: " + firstC.contains() + "/" + firstC.getCapacity());
            System.out.println("Second: " + secondC.contains() + "/" + secondC.getCapacity());

            String input = scanner.nextLine();
            String[] parts = input.split(" ");

            if (input.equals("quit")) {
                break;
            }
            
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            switch (command) {
                case "add":
                    firstC.add(amount);
                    break;
                case "move":
                    if (amount > firstC.contains()) {
                        secondC.add(firstC.contains());
                        firstC.remove(amount);
                    } else {
                        secondC.add(amount);
                        firstC.remove(amount);
                    }
                    break;
                case "remove":
                    secondC.remove(amount);
                    break;
                default:
                    break;
            }
        }
    }
}
