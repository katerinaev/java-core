package hw_5.task_7;
/*
7. Amusement Park
Problem:
The park has rides, each offering its own unique experience and requiring maintenance.
Examples:
Roller coaster – safety check
Carousel – maintenance
Create a system that controls the ride and displays information to visitors.
 */
public class Main {
    public static void main(String[] args) {
        AmusementPark park = new AmusementPark();

        Attraction coaster = new RollerCoaster();
        park.setAttraction(coaster);
        park.manageAttraction();

        System.out.println();

        Attraction carousel = new Carousel();
        park.setAttraction(carousel);
        park.manageAttraction();
    }
}
