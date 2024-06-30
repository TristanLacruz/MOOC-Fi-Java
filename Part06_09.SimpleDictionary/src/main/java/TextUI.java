
import java.util.Scanner;

/**
 *
 * @author trist
 */
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        boolean running = true;
        while (running) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            switch (command) {
                case "end":
                    System.out.println("Bye bye!");
                    running = false;
                    break;
                case "add":
                    add();
                    break;
                case "search":
                    String translation = search();
                    System.out.println("Translation: " + translation);
                    break;
                default:
                    System.out.println("Unknowm command");
            }
        }
    }

    public void add() {
        System.out.print("Word: ");
        String word = scanner.nextLine();
        System.out.print("Translation: ");
        String translation = scanner.nextLine();
        simpleDictionary.add(word, translation);
    }
    
    public String search(){
        System.out.print("To be translated: ");
        String search = scanner.nextLine();
        if(simpleDictionary.translate(search) == null){
            return "Word " + search + " was not found";
        }
        return simpleDictionary.translate(search);
    }
}