package hw_5.task_2;
/*
2. Pet Management
Requirement:
The system can only have one pet, each with its own care requirements.
Examples:
A dog walks and eats dry food
A cat plays and eats wet food
A system must be designed that allows interaction with any pet, taking into account
its specific needs.
*/
public class Main {
    public static void main(String[] args) {
        PetManager owner = new PetManager();

        Pet dog = new Dog();
        Cat cat = new Cat();

//        owner.addPet(dog);
        owner.interact();

//        owner.addPet(cat);
//        owner.interact();
    }
}
