package hw_2.task_5;
/*
Класс Point
Создайте класс Point с координатами x и y. Реализуйте конструктор, геттеры, сеттер
только для x, и метод print(), выводящий координаты. В main измените x, выведите новые
координаты.
 */
public class Point {
    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int newX) {
        this.x = newX;
    }

    public void print() {
        System.out.println("Coordinates are: x = " + this.x + ", y = " + this.y);
    }

    public static void main(String[] args) {
        Point point = new Point(10, 20);
        point.setX(50);
        point.print();
    }
 }
