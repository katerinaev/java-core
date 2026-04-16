package hw_3.task_3;
/*
Создайте класс Library с полями:
private String bookTitle
protected String author
int year (default-доступ)
public String category
Реализуйте геттеры и сеттеры для всех полей.
В другом классе (например, LibraryTest) создайте объект Library и проверьте доступ к полям.
*/
public class Library {
    private String bookTitle;
    protected String author;
    int year;
    public String category;

    public Library(String bookTitle, String author, int year, String category) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.year = year;
        this.category = category;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getCategory() {
        return category;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
