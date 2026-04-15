package hw_5.task_7;

public class RollerCoaster extends Attraction {

    @Override
    void describe() {
        System.out.println("Roller coaster is elevated, specialized railway");
    }

    @Override
    void maintain() {
        System.out.println("Roller coaster needs safety inspections");
    }
}
