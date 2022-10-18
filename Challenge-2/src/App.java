public class App {
    public static void main(String[] args) throws Exception {
        
        // Fiction fiction1 = new Fiction("Harry Potter");
        // NonFiction Nonfiction = new NonFiction("Calculus");

        Book[] book= new Book[2];

        book[0]= new Fiction("Harry Potter");
        book[1]=new NonFiction("Calculus");

        // fiction1.showInfo();
        // for(int i=0;i<book.length;i++){
        //     book[i].showInfo();
        // }
        System.out.println("=============== way1 =====================");
        for(int i = 0; i < book.length; i++){
            System.out.println("Title of " + (i == 0 ? "fiction" : "non fiction") + " book: " + "\n" + book[i].getBookTitle());
        }
        for(int i = 0; i < book.length; i++){
            System.out.println("Title-" + book[i].getBookTitle() + " " + "Cost-" + "$" +book[i].getBookPrice());
        }
        System.out.println("================ way2 ====================");
        // For loop in Array (Name of Class/name/name of array)
        for(Book books:book){
            System.out.println("Title of "+books.getClass().getSimpleName()+ " book.");
            System.out.println(books.getBookTitle());
            System.out.println(books.getBookTitle() + " Cost-$" + books.getBookPrice());
        }
    }
}
