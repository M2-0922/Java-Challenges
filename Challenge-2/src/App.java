//A main class Challenge creates an array (size : 2) of Book variables to store references to objects of each concrete class. 
//For each book, display the string representation as shown below.

/* 
Title of fiction book:
Harry Potter
Title of non fiction book:
Calculus
Title-Harry Potter Cost-$24.99
Title-Calculus Cost-$37.99
*/

public class App {
    public static void main(String[] args) throws Exception {
        Book[] book = new Book[2];
        book[0] = new Fiction("Harry Potter");
        book[1] = new NonFiction("Calculus");

        for(int i = 0; i < book.length; i++){
            System.out.println("Title of " + (i == 0 ? "fiction" : "non fiction")+ " book:" + "\n" + book[i].getTitle());
        }

        for(int i = 0; i < book.length; i++){
            System.out.println("Title-" + book[i].getTitle() + " " + "Cost-" + "$" +book[i].getPrice());
        }
    }
}
