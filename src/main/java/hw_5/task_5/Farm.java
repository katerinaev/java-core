package hw_5.task_5;

public class Farm {
    private FarmAnimal animal;

    public void addAnimal(FarmAnimal animal) {
        this.animal = animal;
    }

    public void manageAnimal() {
        if (animal == null) {
            System.out.println("There's no farm animal on the Farm");
            return;
        }
        this.animal.care();
        this.animal.produce();
    }
}
