package Java_Barry_Burd.chapter7_food_products;

import static java.lang.System.out;

public class FoodProduct {      // Declaring FoodProduct Class and its constructor fields
    String foodType;
    int weight;
    double cost;
    int servings;
    double caloriesPerServing;

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
        out.print("Product: " + foodType + "\n");
        out.print("Weight (grams): " + weight + "\n");
        out.print("Cost: $" + cost + "\n");
        out.print("Servings: " + servings + "\n");
        out.print("Calories Per Serving: " + caloriesPerServing + "\n");
        out.print("Cost (100 grams): $" + getCostPer100Grams() + "\n");
        out.print("Cost (1 serving): $" + getCostPerServing() + "\n");
        out.print("Total Calories Per Product: " + getTotalCalories() + "\n\n");
    }
}
