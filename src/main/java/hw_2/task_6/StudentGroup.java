package hw_2.task_6;
/*
Класс StudentGroup
Создайте класс StudentGroup с полями groupName и studentCount. Реализуйте конструктор,
геттеры и сеттеры, и метод printInfo(), выводящий информацию о группе и количестве студентов.
В main измените число студентов и выведите информацию.
 */
public class StudentGroup {
    private String groupName;
    private int studentCount;

    public StudentGroup(String groupName, int studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public int getStudentCount() {
        return this.studentCount;
    }

    public void setGroupName(String newGroupName) {
        this.groupName = newGroupName;
    }

    public void setStudentCount(int newStudentCount) {
        this.studentCount = newStudentCount;
    }

    public void printInfo() {
        System.out.println("Group name: " + groupName + ", count of students: " + studentCount);
    }

    public static void main(String[] args) {
        StudentGroup group = new StudentGroup("Java QA Automation", 150);
        group.setStudentCount(200);
        group.printInfo();
    }
}
