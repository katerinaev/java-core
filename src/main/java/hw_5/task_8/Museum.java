package hw_5.task_8;

public class Museum {
    private Exhibit exhibit;

    public void setExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
    }

    public void manageExhibit() {
        this.exhibit.history();
        this.exhibit.preserve();
    }
}
