
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }
    // implement the required methods here

    public void addMeal(String meal) {
        if(this.meals.contains(meal)) {
            return;
        }
        this.meals.add(meal);
    }
    
    public void printMeals(){
        int i = 0;
        while(i < this.meals.size()) {
            System.out.println(this.meals.get(i));
            i++;
        }
    }
    
    public void clearMenu() {
        this.meals.clear();
    }
}
