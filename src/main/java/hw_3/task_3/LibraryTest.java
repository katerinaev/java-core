package hw_3.task_3;

public class LibraryTest {
    public static void main(String[] args) {
        Library dune = new Library("Dune", "Frank Herbert", 2020, "Science fiction");

        System.out.println(dune.getBookTitle());
        System.out.println(dune.author);
        System.out.println(dune.year);
        System.out.println(dune.category);
    }
}
