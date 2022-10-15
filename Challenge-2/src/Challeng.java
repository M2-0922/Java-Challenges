public class Challeng {

    public static void main(String[] args) throws Exception {

        //make array(bookList) of fiction and nonfiction classes's instance
        Book[] bookList = new Book[2];

        //make instances and store references to array
        bookList[0] = new Fiction("Harry Potter");
        bookList[1] = new NonFiction("Calculus");
        
        System.out.println("Title of fiction book:\n" + bookList[0].getTitle());
        System.out.println("Title of non fiction book:\n" + bookList[1].getTitle());
        for(int i = 0; i < bookList.length; i++) {
            System.out.println("Title-" + bookList[i].getTitle() + " Cost-$" + bookList[i].getPrice());
        }
    }
}
