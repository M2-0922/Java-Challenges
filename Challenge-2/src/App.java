public class App {
    public static void main(String[] args) throws Exception {
        // instantiation of book object
        Book[] book = new Book[2];
        book[0] = new Fiction("Harry Potter");
        book[1] = new NonFiction("Calculus");

        System.out.println("Title of fiction book:");
        System.out.println(book[0].getBookTitle());
        System.out.println("Title of non fiction book:");
        System.out.println(book[1].getBookTitle());
        System.out.println("Title-" + book[0].getBookTitle() + "Cost-$" + book[0].bookPrice);
        System.out.println("Title-" + book[1].getBookTitle() + "Cost-$" + book[1].bookPrice);
    }
}
