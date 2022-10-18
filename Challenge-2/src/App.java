public class App {
    public static void main(String[] args) {
        // write your code here
        Book[] books = new Book[2];
        books[0] = new Fiction("Harry Potter");
        books[1] = new NonFiction("Calculus");

        // System.out.println("Title of fiction book:");
        // System.out.println(books[0].getTitle());
        // System.out.println("Title of non fiction book:");
        // System.out.println(books[1].getTitle());

        for (Book book : books) {
            System.out.println("Title of " + book.getClass().getSimpleName() + " book:");
            System.out.println(book.getTitle());
            System.out.println(book.getTitle() + " Cost-$" + book.getPrice());
        }
    }
}
