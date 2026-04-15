package hw_5.task_8;

public class Museum {
    private Exhibit exhibit;

    public void setExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
    }

    public void manageExhibit() {
        if (exhibit == null) {
            throw new NullPointerException("There is no exhibit in the Museum");
        }
        this.exhibit.history();
        this.exhibit.preserve();
    }
}
