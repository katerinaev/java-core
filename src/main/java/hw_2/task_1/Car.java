package hw_2.task_1;
/*
Класс Car
Создайте класс Car с полями brand (строка) и year (целое число). Реализуйте конструктор с
двумя параметрами, геттеры и сеттеры для обоих полей, метод print(), выводящий информацию
о марке и годе выпуска. В main создайте объект, установите значения через конструктор,
измените год через сеттер, выведите информацию
 */
public class Car {
    private String brand;
    private int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getYear() {
        return this.year;
    }

    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }

    public void print() {
        System.out.println("Brand: " + this.brand + ", year: " + this.year);
    }

    public static void main(String[] args) {
        Car newCar = new Car("Volkswagen", 2020);
        newCar.setYear(2025);

        newCar.print();
    }
}
