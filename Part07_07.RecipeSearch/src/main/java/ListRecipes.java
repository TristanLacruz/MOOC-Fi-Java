import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ListRecipes {
    private String fileName;
    private ArrayList<Recipe> recipes;
    
    public ListRecipes(String fileName) {
        this.fileName = fileName;
        this.recipes = new ArrayList<>();
    }
    
    public void readListRecipes() {
        try {
            Scanner scanner = new Scanner(Paths.get(fileName));
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine().trim();
                if (scanner.hasNextLine()) {
                    int minutes = Integer.parseInt(scanner.nextLine().trim());
                    ArrayList<String> ingredients = new ArrayList<>();
                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine().trim();
                        if (line.isEmpty()) {
                            break;
                        }
                        ingredients.add(line);
                    }
                    Recipe recipe = new Recipe(name, minutes, ingredients);
                    recipes.add(recipe);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void printRecipes() {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            System.out.println(recipe.getRecipeName() + ", cooking time: " + recipe.getTime());
        }
    }

    public void findByName(String name) {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getRecipeName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(recipe.getRecipeName() + ", cooking time: " + recipe.getTime());
            }
        }
    }

    public void findByCookingTime(int maxTime) {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getTime() <= maxTime) {
                System.out.println(recipe.getRecipeName() + ", cooking time: " + recipe.getTime());
            }
        }
    }

    public void findByIngredient(String ingredient) {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe.getRecipeName() + ", cooking time: " + recipe.getTime());
            }
        }
    }
}
