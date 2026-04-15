package hw_5.task_3;
/*
3. Restaurant Management
Requirement:
A dish is added to the restaurant menu.
Each dish has its own display parameters:
Hot dish - with temperature
Drink - with volume
We need to design a system that allows adding dishes and displaying their descriptions
based on their characteristics.
 */
public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Dish steak = new HotDish(120);

        restaurant.addDish(steak);
        restaurant.makeDescription();

        Drink cocktail = new Drink(300);
        restaurant.addDish(cocktail);
        restaurant.makeDescription();
    }
}
