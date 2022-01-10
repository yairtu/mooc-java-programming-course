import java.util.ArrayList;

public class Recipe {

    private String name;
    private int cookTime;
    private ArrayList<String> ingredients;

    public Recipe(String name, int cookTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookTime = cookTime;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public int getCookTime() {
        return cookTime;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCookTime(int cookTime) {
        this.cookTime = cookTime;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String toString() {
        return this.name + ", cooking time: " + this.cookTime;
    }

}
