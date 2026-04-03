package hw_5.task_5;

public class Farm {
    private FarmAnimal animal;

    public void addAnimal(FarmAnimal animal) {
        this.animal = animal;
    }

    public void manageAnimal() {
        this.animal.care();
        this.animal.produce();
    }
}
