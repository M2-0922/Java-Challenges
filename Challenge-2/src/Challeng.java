public class Challeng {

    public static void main(String[] args) throws Exception {

        //make instances
        Fiction fiction = new Fiction("Harry Potter");
        NonFiction nonFiction = new NonFiction("Calculus");

        //make array(bookList) of fiction and nonfiction classes's instance
        Book[] bookList = new Book[2];

        //store references to array
        bookList[0] = fiction;
        bookList[1] = nonFiction;

        System.out.println("Title of fiction book:");
        System.out.println(bookList[0].getTitle());
        System.out.println("Title of non fiction book:");
        System.out.println(bookList[1].getTitle());
        System.out.println("Title-" + bookList[0].getTitle() + " Cost-$" + bookList[0].getPrice());
        System.out.println("Title-" + bookList[1].getTitle() + " Cost-$" + bookList[1].getPrice());
    }
}
