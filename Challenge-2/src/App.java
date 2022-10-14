public class App {
    public static void main(String[] args) throws Exception {
        Book books[] = new Book[2];

        books[0] = new Fiction("Harry Potter");
        books[1] = new NonFiction("Calculus");

        for(int i = 0; i < books.length; ++i){
            System.out.println("Title of " + (i==0 ? "fiction book:\n" : "non fiction book:\n") + books[i].getTitle());
        }
        
        for(int j = 0; j < books.length; ++j){
            System.out.println("Title-" + books[j].getTitle() + " Cost-$" + books[j].getPrice());
        }
        
    }
}
