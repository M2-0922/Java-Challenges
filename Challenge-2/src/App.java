public class App {
    public static void main(String[] args) throws Exception {
        Book[] books = {
                new Fiction("Harry Potter"),
                new NonFiction("Calculus")
        };

        for (Book book : books) {
            book.getFormattedTitle();
        }

        for (Book book : books) {
            book.getFormattedCost();
        }
    }
}
