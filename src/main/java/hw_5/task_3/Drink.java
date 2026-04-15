package hw_5.task_3;

public class Drink extends Dish {
    private int volume;

    public Drink(int volume) {
        this.volume = volume;
    }

    public void describe() {
        System.out.println("Drink " + this.volume + " ml");
    }
}
