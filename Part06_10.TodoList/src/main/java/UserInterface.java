
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author trist
 */
public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;
    
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }

    public void start() {
        boolean running = true;
        while (running) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            switch (command) {
                case "add":
                    System.out.print("Task: ");
                    String task = scanner.nextLine();
                    todoList.add(task);
                    break;
                case "list":
                    todoList.print();
                    break;
                case "remove":
                    System.out.print("Which one is removed? ");
                    int id = Integer.valueOf(scanner.nextLine());
                    todoList.remove(id);
                    break;
                case "stop":
                    running = false;
                    break;
                default:
                    break;
            }
        }

    }
}
