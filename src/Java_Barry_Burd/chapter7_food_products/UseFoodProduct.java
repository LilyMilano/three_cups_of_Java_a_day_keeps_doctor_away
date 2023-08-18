package Java_Barry_Burd.chapter7_food_products;

public class UseFoodProduct {
    public static void main(String[] args) {

        // Declaring and Initializing three new Objects instances of Organization Class:
        FoodProduct product1 = new FoodProduct();
        FoodProduct product2 = new FoodProduct();
        FoodProduct product3 = new FoodProduct();

        // Setting values to constructor fields of each new Object:
        product1.setFoodType("Peach Slices");
        product1.setWeight(500);
        product1.setCost(1.83);
        product1.setServings(4);
        product1.setCaloriesPerServing(70.0);

        product2.setFoodType("Black Beans");
        product2.setWeight(1000);
        product2.setCost(2.5);
        product2.setServings(10);
        product2.setCaloriesPerServing(120.5);

        product3.setFoodType("Organic Rice");
        product3.setWeight(250);
        product3.setCost(3.5);
        product3.setServings(5);
        product3.setCaloriesPerServing(10.0);

        // Using display() - Dot Notation
        product1.display();
        product2.display();
        product3.display();

        /* Output:
        Product: Peach Slices
        Weight (grams): 500
        Cost: $1.83
        Servings: 4
        Calories Per Serving: 70.0
        Cost (100 grams): $0.366
        Cost (1 serving): $0.4575
        Total Calories Per Product: 280.0

        Product: Black Beans
        Weight (grams): 1000
        Cost: $2.5
        Servings: 10
        Calories Per Serving: 120.5
        Cost (100 grams): $0.25
        Cost (1 serving): $0.25
        Total Calories Per Product: 1205.0

        Product: Organic Rice
        Weight (grams): 250
        Cost: $3.5
        Servings: 5
        Calories Per Serving: 10.0
        Cost (100 grams): $1.4
        Cost (1 serving): $0.7
        Total Calories Per Product: 50.0
        */

        //..............................................................................................................

    }
}
