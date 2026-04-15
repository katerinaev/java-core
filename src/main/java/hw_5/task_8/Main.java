package hw_5.task_8;
/*
8. Museum
Requirement:
An exhibit is on display in a museum.
Each exhibit has its own history and storage conditions.
Examples:
Manuscript - requires controlled humidity
Sculpture - needs restoration
A system needs to be created that manages the exhibit and provides information about it.
*/
public class Main {
    public static void main(String[] args) {
        Museum museum = new Museum();

        Exhibit manuscript = new Manuscript();
        Exhibit sculpture = new Sculpture();

        museum.setExhibit(manuscript);
        museum.manageExhibit();
        System.out.println();
        museum.setExhibit(sculpture);
        museum.manageExhibit();
    }
}
