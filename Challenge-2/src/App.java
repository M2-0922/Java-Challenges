import Book.*;

public class App {
    public static void main(String[] args) throws Exception {

        Book[] book = new Book[2];

        book[0] = new Fiction("Harry Potter");
        book[1] = new NonFiction("Calculus");

        System.out.println(Book.display(book));
    }
}
