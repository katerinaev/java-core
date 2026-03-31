package hw_2.task_2;
/*
Класс Rectangle
Создайте класс Rectangle с полями width и height. Реализуйте конструктор, геттеры для ширины
и высоты, сеттер только для ширины и метод calculateArea() для расчёта площади.
В main создайте прямоугольник, измените ширину и выведите площадь.
 */
public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setWidth(int newWidth) {
        this.width = newWidth;
    }

    public double calculateArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 7);

        rectangle.setWidth(5);
        System.out.println(rectangle.calculateArea());
    }
}
