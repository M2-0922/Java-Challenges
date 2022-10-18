import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // write your code here
        Book[] books = new Book[2];
        books[0] = new Fiction("Harry Potter", 24.99);
        books[1] = new NonFiction("Calculus", 37.99);

        for (Book x : books) {
            System.out.println("Title of " + x.getClass().getName() + " book:");
            System.out.println(x.returnTitle());
        }

        for (Book x: books) {
            System.out.println(x.returnTitle() + " Cost-$" + x.returnPrice());
        }
    }
}
