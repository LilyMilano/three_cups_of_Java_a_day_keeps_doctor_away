package Java_Barry_Burd.chapter7_food_products;

import static java.lang.System.out;

public class FoodProduct {      // Declaring FoodProduct Class and its constructor fields
    private String foodType;
    private int weight;
    private double cost;
    private int servings;
    private double caloriesPerServing;

    // Setters and getters:

    public void setFoodType(String foodType1) {
        if(!foodType1.equals("")){
        foodType = foodType1;
        }
    }
    public String getFoodType() {
        return foodType;
    }
    public void setWeight(int weight1) {
        if(weight1 >= 0){
        weight = weight1;
        }
    }
    public int getWeight() {
        return weight;
    }
    public void setCost(double cost1) {
        if (cost1 >= 0) {
            cost = cost1;
        }
    }
    public double getCost() {
        return cost;
    }
    public void setServings(int servings1) {
        if(servings1 >= 0){
            servings = servings1;
        }
    }
    public int getServings() {
        return servings;
    }
    public void setCaloriesPerServing(double caloriesPerServing1) {
        if(caloriesPerServing1 >= 0){
            caloriesPerServing = caloriesPerServing1;
        }
    }
    public double getCaloriesPerServing() {
        return caloriesPerServing;
    }

    // Methods:
    public double getCostPer100Grams(){
        return cost * 100 / weight;
    }
    public double getCostPerServing(){
        return cost * 1 / servings;
    }
    public double getTotalCalories(){
        return caloriesPerServing * servings;
    }

    // Display method:
    public void display() {
        out.print("Product: " + getFoodType() + "\n");
        out.print("Weight (grams): " + getWeight() + "\n");
        out.print("Cost: $" + getCost() + "\n");
        out.print("Servings: " + getServings() + "\n");
        out.print("Calories Per Serving: " + getCaloriesPerServing() + "\n");
        out.print("Cost (100 grams): $" + getCostPer100Grams() + "\n");
        out.print("Cost (1 serving): $" + getCostPerServing() + "\n");
        out.print("Total Calories Per Product: " + getTotalCalories() + "\n\n");
    }
}
