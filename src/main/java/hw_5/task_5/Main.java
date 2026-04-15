package hw_5.task_5;
/*
5. Farm
Requirements:
The farm contains one domestic animal.
Each animal has its own functions and needs.
Examples:
A cow produces milk and needs to be grazed.
A chicken lays eggs and requires grain.
A system must be created that allows for managing the animal according to its needs.
*/
public class Main {
    public static void main(String[] args) {
        Farm ourFarm = new Farm();

        FarmAnimal hen = new Chicken();
        ourFarm.addAnimal(hen);
        ourFarm.manageAnimal();

        System.out.println();

        FarmAnimal cow = new Cow();
        ourFarm.addAnimal(cow);
        ourFarm.manageAnimal();
    }
}
