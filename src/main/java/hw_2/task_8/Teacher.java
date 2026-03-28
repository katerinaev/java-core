package hw_2.task_8;
/*
Класс Teacher
Создайте класс Teacher с полями name и subject. Реализуйте конструктор, геттеры и сеттеры,
и метод printInfo(), выводящий информацию о учителе и предмете. В main измените предмет и
выведите обновлённую информацию.
 */
public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return this.name;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setSubject(String newSubject) {
        this.subject = newSubject;
    }

    public void printInfo() {
        System.out.println("Teacher " + name + " teaches " + subject);
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Alex", "QA");
        teacher.setSubject("Java AQA");
        teacher.printInfo();
    }
}
