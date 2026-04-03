package hw_5.task_7;

public class AmusementPark {
    private Attraction attraction;

    public void setAttraction(Attraction attraction) {
        this.attraction = attraction;
    }

    public void manageAttraction() {
        this.attraction.describe();
        this.attraction.maintain();
    }
}
