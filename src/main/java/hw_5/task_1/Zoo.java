package hw_5.task_1;

public class Zoo {
    private Animal animal;

    public void addAnimal(Animal animal) {
        this.animal = animal;
    }

    public void showBehavior() {
        if (animal == null) {
            System.out.println("Animal was not added to Zoo");
            return;
        }
        this.animal.move();
        this.animal.makeSound();
    }

}
