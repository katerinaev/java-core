package hw_5.task_6;

public class BotanicalGarden {
    private Plant plant;

    public void setPlant(Plant plant) {
        this.plant = plant;
    }

    public void careForPlant() {
        if (plant == null) {
            System.out.println("There is no plant in the Botanical Garden");
            return;
        }
        this.plant.care();
    }
}
