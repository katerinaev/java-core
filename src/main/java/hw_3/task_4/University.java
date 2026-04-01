package hw_3.task_4;
/*
Класс University
Создайте класс University с полями:
static String universityName — общее имя университета
final int studentID — уникальный ID
String studentName
Реализуйте конструктор для studentID и studentName,
статический метод changeUniversityName(String newName), геттер для studentName,
метод printStudentInfo() — выводит имя, ID и университет.
В main: создайте 3 студента, измените название университета и выведите данные.
 */
public class University {
    static String universityName = "Harvard University";

    final int studentID;
    String studentName;

    public University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    static void changeUniversityName(String newName) {
        universityName = newName;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void printStudentInfo() {
        System.out.println("Student name: " + studentName + ", id: " + studentID + ", University: " + universityName);
    }

    public static void main(String[] args) {
        University ivan = new University(120, "Ivan Klepov");
        University arty = new University(125, "Artem Yan");
        University marina = new University(130, "Marina Ev");

        changeUniversityName("Stanford University");

        ivan.printStudentInfo();
        arty.printStudentInfo();
        marina.printStudentInfo();
    }
}
