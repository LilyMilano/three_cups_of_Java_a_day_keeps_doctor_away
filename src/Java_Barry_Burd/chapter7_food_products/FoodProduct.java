package Java_Barry_Burd.chapter7_food_products;

import static java.lang.System.out;

public class FoodProduct {      // Declaring FoodProduct Class and its constructor fields
    String foodType;
    int weight;
    double cost;
    int servings;
    double caloriesPerServing;

    // Display method:
    public void display() {
        out.print("Product: " + foodType + "\n");
        out.print("Weight (grams): " + weight + "\n");
        out.print("Cost: $" + cost + "\n");
        out.print("Servings: " + servings + "\n");
        out.print("Calories Per Serving: " + caloriesPerServing + "\n\n");
    }
}
