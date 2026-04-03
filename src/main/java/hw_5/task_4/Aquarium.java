package hw_5.task_4;

public class Aquarium {
    private SeaCreature seaCreature;

    public void addCreature(SeaCreature seaCreature) {
        this.seaCreature = seaCreature;
    }

    public void showBehavior() {
        this.seaCreature.move();
    }
}
