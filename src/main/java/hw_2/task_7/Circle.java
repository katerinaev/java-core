package hw_2.task_7;
/*
Класс Circle
Создайте класс Circle с полем radius. Реализуйте конструктор, геттер и сеттер, методы
calculateArea() и calculateCircumference(). В main измените радиус, выведите площадь и
длину окружности.
 */
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(10.0);
        circle.setRadius(100);

        System.out.println("Cicrcle area: " + circle.calculateArea());
        System.out.println("Cicrcle circumfernce: " + circle.calculateCircumference());
    }
}
