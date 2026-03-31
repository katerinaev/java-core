package hw_2.task_10;
/*
Класс Laptop
Создайте класс Laptop с полями brand и price. Реализуйте конструктор, геттеры и сеттеры,
и метод printInfo(), выводящий информацию о ноутбуке и его цене. В main измените цену и
выведите информацию.
*/
public class Laptop {
    private String brand;
    private double price;

    public Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return this.brand;
    }

    public double getPrice() {
        return this.price;
    }

    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public void printInfo() {
        System.out.println("Laptop " + brand + ", price " + price + " euro");
    }

    public static void main(String[] args) {
        Laptop apple = new Laptop("Apple MacBook Air M5", 1500);
        apple.setPrice(1700);
        apple.printInfo();
    }
}
