package hw_3;

import hw_3.task_3.Library;

public class LibraryTest2 extends Library {

    public LibraryTest2(String bookTitle, String author, int year, String category) {
        super(bookTitle, author, year, category);
    }

    public static void main(String[] args) {
        Library foundation = new Library("Foundation", "Isaak Asimov", 2000, "Science fiction");

        LibraryTest2 tom = new LibraryTest2("Tom Sawyer", "Mark Twain", 2015, "Adventures");

        System.out.println(tom.getBookTitle());
        System.out.println(tom.author); // protected
        System.out.println(tom.getYear());
        System.out.println(tom.category);

        System.out.println(foundation.getBookTitle());
        System.out.println(foundation.getAuthor());
        System.out.println(foundation.getYear());
        System.out.println(foundation.category);
    }
}
