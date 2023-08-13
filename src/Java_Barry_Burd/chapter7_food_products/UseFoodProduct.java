package Java_Barry_Burd.chapter7_food_products;

public class UseFoodProduct {
    public static void main(String[] args) {

        // Declaring and Initializing three new Objects instances of Organization Class:
        FoodProduct product1 = new FoodProduct();
        FoodProduct product2 = new FoodProduct();
        FoodProduct product3 = new FoodProduct();

        // Giving values to constructor fields of each new Object:
        product1.foodType = "Peach Slices";
        product1.weight = 500;
        product1.cost = 1.83;
        product1.servings = 4;
        product1.caloriesPerServing = 70.0;

        product2.foodType = "Black Beans";
        product2.weight = 1000;
        product2.cost = 2.5;
        product2.servings = 10;
        product2.caloriesPerServing = 120.5;

        product3.foodType = "Organic Rice";
        product3.weight =  250;
        product3.cost =  3.5;
        product3.servings = 5;
        product3.caloriesPerServing  = 10.0;

        // Using Objects Fields - Dot Notation
        // Printing values:

        System.out.println("Product: " + product1.foodType + "\n" + "Weight (grams): " + product1.weight + "\n" + "Cost: $" + product1.cost + "\n" + "Servings: " + product1.servings + "\n" + "Calories Per Serving: " + product1.caloriesPerServing + "\n");
        System.out.println("Product: " + product2.foodType + "\n" + "Weight (grams): " + product2.weight + "\n" + "Cost: $" + product2.cost + "\n" + "Servings: " + product2.servings + "\n" + "Calories Per Serving: " + product2.caloriesPerServing + "\n");
        System.out.println("Product: " + product3.foodType + "\n" + "Weight (grams): " + product3.weight + "\n" + "Cost: $" + product3.cost + "\n" + "Servings: " + product3.servings + "\n" + "Calories Per Serving: " + product3.caloriesPerServing + "\n");

        /* Output:
        Product: Peach Slices
        Weight (grams): 500
        Cost: $1.83
        Servings: 4
        Calories Per Serving: 70.0

        Product: Black Beans
        Weight (grams): 1000
        Cost: $2.5
        Servings: 10
        Calories Per Serving: 120.5

        Product: Organic Rice
        Weight (grams): 250
        Cost: $3.5
        Servings: 5
        Calories Per Serving: 10.0
        */
    }
}
