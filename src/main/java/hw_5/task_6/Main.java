package hw_5.task_6;
/*
6. Botanical Garden
Requirements:
A botanical garden contains one plant.
Different plants have different care requirements.
Examples:
Orchid - high humidity and shade.
Cactus - lots of light, infrequent watering.
You need to design a system that can accommodate the plant and provide the necessary care.
*/
public class Main {
    public static void main(String[] args) {
        BotanicalGarden garden = new BotanicalGarden();

        Plant cactus = new Cactus();
        garden.setPlant(cactus);
        garden.careForPlant();

        Plant orchid = new Orchid();
        garden.setPlant(orchid);
        garden.careForPlant();
    }
}
