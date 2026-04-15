package hw_5.task_4;
/*
4. Aquarium
Requirements:
The aquarium can contain one sea creature.
Depending on the creature, it behaves differently.
Examples:
A shark swims quickly and aggressively.
A starfish crawls slowly.
You need to design a system in which you can add the creature and demonstrate its behavior.
*/
public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        SeaCreature star = new StarFish();

        aquarium.addCreature(star);
        aquarium.showBehavior();

        SeaCreature sharik = new Shark();
        aquarium.addCreature(sharik);
        aquarium.showBehavior();
    }
}
