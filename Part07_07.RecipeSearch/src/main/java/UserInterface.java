import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ListRecipes listRecipes;
    
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }
    
    public void start() {
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        listRecipes = new ListRecipes(fileName);
        listRecipes.readListRecipes(); // Leer recetas al inicio

        boolean running = true;
        while (running) {
            menu();
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            switch (command) {
                case "list":
                    listRecipes.printRecipes();
                    break;
                case "stop":
                    running = false;
                    break;
                case "find name":
                    System.out.print("Searched word: ");
                    String searchedWord = scanner.nextLine();
                    listRecipes.findByName(searchedWord);
                    break;
                case "find cooking time":
                    System.out.print("Max cooking time: ");
                    int maxTime = Integer.parseInt(scanner.nextLine());
                    listRecipes.findByCookingTime(maxTime);
                    break;
                case "find ingredient":
                    System.out.print("Ingredient: ");
                    String ingredient = scanner.nextLine();
                    listRecipes.findByIngredient(ingredient);
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }
    
    private void menu() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
    }
}
