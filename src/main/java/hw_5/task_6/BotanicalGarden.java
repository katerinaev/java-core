package hw_5.task_6;

public class BotanicalGarden {
    private Plant plant;

    public void setPlant(Plant plant) {
        this.plant = plant;
    }

    public void careForPlant() {
        this.plant.care();
    }
}
