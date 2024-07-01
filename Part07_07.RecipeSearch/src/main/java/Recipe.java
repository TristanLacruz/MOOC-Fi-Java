import java.util.ArrayList;

public class Recipe {
    private String recipeName;
    private int minutes;
    private ArrayList<String> ingredients;

    public Recipe(String recipeName, int minutes, ArrayList<String> ingredients) {
        this.recipeName = recipeName;
        this.minutes = minutes;
        this.ingredients = ingredients;
    }  
    
    public String getRecipeName() {
        return this.recipeName;
    }
    
    public int getTime() {
        return this.minutes;
    }
    
    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }
}
