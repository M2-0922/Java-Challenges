public class App {
    public static void main(String[] args) {
        // write your code here
        Book[] books = new Book[2];
        books[0] = new Fiction("The Great Gatsby");
        books[1] = new NonFiction("The Great Gatsby");

        for (Book book : books) {
            System.out.println(book.getTitle() + " costs $" + book.getPrice());
        }
    }
}
