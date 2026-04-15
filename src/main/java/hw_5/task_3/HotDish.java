package hw_5.task_3;

public class HotDish extends Dish {
    private int temperature;

    public HotDish(int temperature) {
        this.temperature = temperature;
    }

    public void describe() {
        System.out.println("Hot dish " + this.temperature + "°C");
    }
}
