package hw_2.task_9;
/*
Класс Product
Создайте класс Product с полями name и price. Реализуйте конструктор, геттеры,
сеттер для цены, метод applyDiscount(discount) для применения скидки, и метод printInfo(),
выводящий информацию о товаре и цене. В main измените цену, примените скидку и выведите цену.
 */
public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void applyDiscount(double discount) {
        price -= price * discount / 100;
    }

    public void printInfo() {
        System.out.println("Product: " + name + ", price: " + price + "$");
    }

    public static void main(String[] args) {
        Product laptop = new Product("Lenovo", 1750);

        laptop.setPrice(1500);
        laptop.applyDiscount(10);
        laptop.printInfo();
    }
}
