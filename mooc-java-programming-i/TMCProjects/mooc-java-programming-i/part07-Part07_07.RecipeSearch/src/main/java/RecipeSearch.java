
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        System.out.println("");

        System.out.print("Commands: " + '\n' +
                "list - lists the recipes" + '\n' +
                "stop - stops the program" + '\n' +
                "find name - searches recipes by name" + '\n' +
                "find cooking time - searches recipes by cooking time" + '\n' +
                "find ingredient - searches recipes by ingredient");

        ArrayList<Recipe> recipes = new ArrayList<>();

        try (Scanner reader = new Scanner(Paths.get(file))) {

            ArrayList<String> lines = new ArrayList<>();

            while(reader.hasNextLine()) {

                String line = reader.nextLine();

                if(line.isEmpty() || !reader.hasNextLine()) {
                    String name = lines.get(0);
                    int cookTime = Integer.valueOf(lines.get(1));

                    ArrayList<String> ingredients = new ArrayList<>();

                    for(int i = 2; i < lines.size(); i++) {
                        ingredients.add(lines.get(i));
                    }

                    recipes.add(new Recipe(name, cookTime, ingredients));
                    lines.clear();
                    continue;
                }

                lines.add(line);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

         while(true) {
             System.out.println(" ");
             System.out.print("Enter a command: ");
             String in = scanner.nextLine();

             if(in.equalsIgnoreCase("stop")) {
                 break;
             } else if(in.equalsIgnoreCase("list")) {
                 System.out.println("Recipes:");
                 for(int i = 0; i < recipes.size(); i++) {
                     System.out.println(recipes.get(i));
                 }
             } else if(in.equalsIgnoreCase("find name")) {
                 System.out.println("Recipes:");
                 System.out.print("Searched word: ");
                 String word = scanner.nextLine();

                 for(int i = 0; i < recipes.size(); i++) {
                     if(recipes.get(i).getName().contains(word)) {
                         System.out.println(recipes.get(i));
                     }
                 }
             } else if(in.equalsIgnoreCase("find cooking time")) {
                 System.out.print("Max cooking time: ");
                 int time = Integer.valueOf(scanner.nextLine());
                 System.out.println("Recipes: ");
                 for(int i = 0; i < recipes.size(); i++) {
                     if(recipes.get(i).getCookTime() <= time) {
                         System.out.println(recipes.get(i));
                     }
                 }
             } else if(in.equalsIgnoreCase("find ingredient")) {
                 System.out.print("Ingredient: ");
                 String ing = scanner.nextLine();
                 System.out.println("Recipes:");
                 for(int i = 0; i < recipes.size(); i++) {
                     if(recipes.get(i).getIngredients().contains(ing)) {
                         System.out.println(recipes.get(i));
                     }
                 }
             }
         }
    }

}
