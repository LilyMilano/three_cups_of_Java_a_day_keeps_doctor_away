package Java_Barry_Burd.chapter12.recipe;
import java.util.ArrayList;
public class Recipes {
    public static void main(String[] args) {
        ArrayList<Recipe> recipes = new ArrayList<>();
        fillTheList(recipes);

        int total = recipes.stream()
                .filter(Recipe::isVegetarian)
                .map(Recipe::getTime)
                .reduce(0, Integer::sum);

        int count = recipes.stream()
                .filter(Recipe::isVegetarian)
                .map(recipe -> 1)
                .reduce(0, Integer::sum);

        System.out.println((double)total / (double)count);    // Output: 250.0
    }
    static void fillTheList(ArrayList<Recipe> recipes){
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(Ingredient.BEEF);
        ingredients.add(Ingredient.HAM);
        ingredients.add(Ingredient.APPLES);
        recipes.add(new Recipe("Recipe1", ingredients, 100));

        ingredients = new ArrayList<>();
        ingredients.add(Ingredient.PEAS);
        ingredients.add(Ingredient.CARROTS);
        recipes.add(new Recipe("Recipe2", ingredients, 200));

        ingredients = new ArrayList<>();
        ingredients.add(Ingredient.PEAS);
        ingredients.add(Ingredient.APPLES);
        recipes.add(new Recipe("Recipe3", ingredients, 300));
    }
}












