package Java_Barry_Burd.chapter12.recipe;

import java.util.ArrayList;

public class Recipe {
    // Fields
    private String name;
    private ArrayList<Ingredient> ingredients;
    private int time;

    // Constructor
    public Recipe(String name, ArrayList<Ingredient>  ingredients, int time){
        this.name = name;
        this.ingredients = ingredients;
        this.time = time;
    }

    // Getters and Setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }
    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }

    // Methods
    public boolean isVegetarian(){
        return !ingredients.contains(Ingredient.BEEF) && !ingredients.contains(Ingredient.HAM);
    }
}
