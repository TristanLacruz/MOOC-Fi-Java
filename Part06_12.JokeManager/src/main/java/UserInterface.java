
import java.util.Scanner;


/**
 *
 * @author trist
 */
public class UserInterface {

    private Scanner scanner;
    private JokeManager manager;

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }

    public void start() {
        boolean running = true;
        while (running) {
            menu();
            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    System.out.println("Write the joke to be added:");
                    String joke = scanner.nextLine();
                    manager.addJoke(joke);
                    break;
                case "2":
                    System.out.println("Drawing a joke.");
                    System.out.println(manager.drawJoke());
                    break;
                case "3":
                    System.out.println("Printing jokes.");
                    manager.printJokes();
                    break;
                case "X":
                    running = false;
                    break;
                default:
                    break;
            }
        }
    }

    public void menu() {
        System.out.println("Commands:");
        System.out.println("1- add a joke");
        System.out.println("2- draw a joke");
        System.out.println("3- list jokes");
        System.out.println("X- stop");
    }
}



