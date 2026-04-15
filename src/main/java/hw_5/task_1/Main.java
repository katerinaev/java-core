package hw_5.task_1;
/*
1. Zoo
Task:
There is one animal in a zoo, but it can be different: a bird or an elephant.
Each animal makes unique sounds and moves differently.
For example, an elephant trumpets and walks, while a bird chirps and flies.
You need to design a system that can work with any animal,
add it to the zoo, and demonstrate its behavior.
*/
public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Animal bird = new Bird();
        zoo.addAnimal(bird);
        zoo.showBehavior();

        Animal elly = new Elephant();
        zoo.addAnimal(elly);
        zoo.showBehavior();
    }
}
