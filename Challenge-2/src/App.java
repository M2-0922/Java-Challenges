// import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // write your code here
        Fiction fiction = new Fiction();
        fiction.title = "Harry Potter";
        
        NonFiction nonFiction = new NonFiction();
        nonFiction.title = "Calculus";
        
        String[][] bookInfo = new String[2][3];
        bookInfo[0][0] = "Title of fiction book:";
        bookInfo[0][1] = fiction.getTitle();
        bookInfo[0][2] = "Title of non fiction book:";
        bookInfo[1][0] = nonFiction.getTitle();
        bookInfo[1][1] = "Title-Harry Potter Cost-" + fiction.setPrice();
        bookInfo[1][2] = "Title-Calculus Cost-" + nonFiction.setPrice();
        // System.out.println(Arrays.deepToString(bookInfo));

        for (int i = 0; i < bookInfo.length; i++) {
            for (int j = 0; j < bookInfo[i].length; j++) {
                System.out.println(bookInfo[i][j]);
            }
        }

    }
}

/*
  Within the class, include a constructor that requires the book title and two get methods: one that returns the title and one that returns the price. Also include an abstract method named `setPrice()`. 
  Create two child classes of Book: `Fiction` and `NonFiction`. 
  
  Within the constructors for the Fiction and NonFiction classes, call setPrice so all Fiction Books cost `$24.99` and all Non Fiction Books cost `$37.99`.

   A main class Challenge creates an array (size : 2) of Book variables to store references to objects of each concrete class. For each book, display the string representation as shown below.
 */

/*
Title of fiction book:
Harry Potter
Title of non fiction book:
Calculus
Title-Harry Potter Cost-$24.99
Title-Calculus Cost-$37.99
*/