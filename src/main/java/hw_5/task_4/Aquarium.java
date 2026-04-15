package hw_5.task_4;

public class Aquarium {
    private SeaCreature seaCreature;

    public void addCreature(SeaCreature seaCreature) {
        this.seaCreature = seaCreature;
    }

    public void showBehavior() {
        if (seaCreature == null) {
            System.out.println("There's no sea creature in aquarium");
            return;
        }
        this.seaCreature.move();
    }
}
