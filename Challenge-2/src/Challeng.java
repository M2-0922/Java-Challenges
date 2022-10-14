public class Challeng {

    public static void main(String[] args) throws Exception {

        //make instances
        Fiction fiction = new Fiction("Harry Potter", 24.99);
        NonFiction nonFiction = new NonFiction("Calculus", 37.99);

        //make array(bookList) of fiction and nonfiction classes's instance
        Book[] bookList = new Book[2];

        //store references to array
        bookList[0] = fiction;
        bookList[1] = nonFiction;

        System.out.println("Title of fiction book:\n" + bookList[0].title);
        System.out.println("Title of non fiction book:\n" + bookList[1].title);
        bookList[0].setPrice();
        bookList[1].setPrice();
    }
}
