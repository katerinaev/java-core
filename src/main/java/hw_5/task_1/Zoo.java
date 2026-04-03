package hw_5.task_1;

public class Zoo {
    private Animal animal;

    public void addAnimal(Animal animal) {
        this.animal = animal;
    }

    public void showBehavior() {
        this.animal.move();
        this.animal.makeSound();
    }

}
