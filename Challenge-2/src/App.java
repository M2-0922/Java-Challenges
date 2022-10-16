public class App {
    public static void main(String[] args) throws Exception {

        Fiction fiction = new Fiction("Harry Potter", 0.0);
        NonFiction nonFiction = new NonFiction("Calculus", 0.0);

        Book[] bookArray = new Book[2];

        bookArray[0] = fiction;
        bookArray[1] = nonFiction;

        System.out.println("Title of fiction book:");
        System.out.println(bookArray[0].getTitle());

        System.out.println("Title of non fiction book:");
        System.out.println(bookArray[1].getTitle());

        System.out.println("Title-" + bookArray[0].getTitle() + " Cost-$" + bookArray[0].getPrice());
        System.out.println("Title-" + bookArray[1].getTitle() + " Cost-$" + bookArray[1].getPrice());
    }
}
