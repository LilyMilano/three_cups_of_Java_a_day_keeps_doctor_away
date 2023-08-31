package Java_Barry_Burd.chapter7_food_products;

import Java_Barry_Burd.chapter7_GUI.PracticeFrame;

public class UseFoodProductGUI {
    public static void main(String[] args) {
        PracticeFrame frame = new PracticeFrame("GUI CHOP SUEY");
        frame.addRow("Food product");
        frame.addRow("Weight (grams)");
        frame.addRow("Cost ($)");
        frame.addRow("Number of servings");
        frame.addRow("Calories per serving");
        frame.setButtonText("Display");
        frame.go();
    }

    public static String calculate(String foodType, int weight, double cost, int servings, double caloriesPerServing){
        FoodProduct healthyFood = new FoodProduct();

        healthyFood.setFoodType(foodType);
        healthyFood.setWeight(weight);
        healthyFood.setCost(cost);
        healthyFood.setServings(servings);
        healthyFood.setCaloriesPerServing(caloriesPerServing);

        return "Product: "+ healthyFood.getFoodType() + ", Cost per 100 grams: $"+ healthyFood.getCostPer100Grams() + ", Cost per serving: $"+ healthyFood.getCostPerServing() + ", Calories per product: "+ healthyFood.getTotalCalories();
    }
}


