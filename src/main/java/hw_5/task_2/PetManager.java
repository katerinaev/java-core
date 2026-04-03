package hw_5.task_2;

public class PetManager {
    private Pet pet;

    public void addPet(Pet pet) {
        this.pet = pet;
    }

    public void interact() {
        this.pet.eat();
        this.pet.act();
    }
}
