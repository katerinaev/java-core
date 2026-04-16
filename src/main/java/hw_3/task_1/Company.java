package hw_3.task_1;
/*
Создайте класс Company с полями:
static String companyName — общее название для всех сотрудников
final int employeeID — уникальный идентификатор (нельзя менять)
String employeeName — имя сотрудника
Реализуйте конструктор, принимающий employeeID и employeeName,
статический метод printCompanyName(),
геттеры и сеттеры для employeeName.
В main: создайте несколько сотрудников, измените companyName и проверьте,
что она изменилась для всех. Попробуйте изменить employeeID — должно быть невозможно.
 */
public class Company {
    static String companyName = "Disney";
    final int employeeID;
    String employeeName;

    public Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    static void printCompanyName() {
        System.out.println("company name: " + companyName);
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeName(String newName) {
        this.employeeName = newName;
    }

    public static void main(String[] args) {
        Company ivan = new Company(100, "Ivan Klepov");
        Company artem = new Company(200, "Artem Yanush");

        companyName = "Pixar";
        printCompanyName();
    }
}
