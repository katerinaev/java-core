package hw_5.task_2;

public class PetManager {
    private Pet pet;

    public void addPet(Pet pet) {
        this.pet = pet;
    }

    public void interact() {
        if (pet == null) {
            System.out.println("There's no pet in the house.");
            return;
        }
        this.pet.eat();
        this.pet.act();
    }
}
