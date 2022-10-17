public class App {
    public static void main(String[] args) throws Exception {
        // write your code here
        Fiction fiction = new Fiction();
        NonFiction nonFiction = new NonFiction();

        fiction.title = "Harry Potter";
        nonFiction.title = "calculus";
        fiction.setPrice();
        nonFiction.setPrice();

        Book[] books = new Book[2];

        books[0] = fiction;
        books[1] = nonFiction;

        System.out.println("Title of fiction book:");
        System.out.println(books[0].getTitle());
        System.out.println("Title of non fiction book:");
        System.out.println(books[1].getTitle());
        System.out.println("Title-" + books[0].getTitle() + " Cost-$" + books[0].getPrice());
        System.out.println("Title-" + books[1].getTitle() + " Cost-$" + books[1].getPrice());
    }
}
