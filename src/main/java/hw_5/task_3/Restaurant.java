package hw_5.task_3;

public class Restaurant {
    private Dish dish;

    public void addDish(Dish dish) {
        this.dish = dish;
    }

    public void makeDescription() {
        if (dish == null) {
            System.out.println("There's no dish in menu");
            return;
        }
        this.dish.describe();
    }
}
