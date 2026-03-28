package hw_2.task_3;
/*
Класс Book
Создайте класс Book с полями title и author. Реализуйте конструктор, геттеры и сеттеры,
и метод printInfo(), выводящий название и автора книги. В main создайте книгу,
измените автора и выведите информацию.
 */
public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void printInfo() {
        System.out.println("Title: " + this.title + ", Author: " + this.author);
    }

    public static void main(String[] args) {
        Book chronicles = new Book("The Chronicles of Narnia", "Lewis");
        chronicles.setAuthor("Clive Lewis");
        chronicles.printInfo();
    }
}
