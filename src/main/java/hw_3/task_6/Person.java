package hw_3.task_6;
/*
Создайте класс Person с полями:
private String firstName
private String lastName
private final String ssn — номер социального страхования
Реализуйте конструктор для всех трёх полей, геттеры для всех полей,
сеттеры только для firstName и lastName,
метод printPersonInfo() — выводит: "Имя: Иван, Фамилия: Иванов, SSN: 123-45-6789".
В main: создайте несколько объектов, измените имя у одного и выведите информацию.
 */
public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;

    public Person(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void printPersonInfo() {
        System.out.println("First name: " + firstName + ", Last name: " + lastName + ", SSN: " + ssn);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Ivan", "Ivanov", "111-22-4444");
        Person person2 = new Person("Petr", "Petrov", "999-88-6666");

        person1.setFirstName("Stepan");

        person1.printPersonInfo();
        person2.printPersonInfo();
    }
}
