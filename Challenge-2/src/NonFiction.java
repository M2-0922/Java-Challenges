public class NonFiction extends Book {
    
    //constructor
    public NonFiction(String bookTitle){
        super(bookTitle);
        setPrice();
    }

    @Override
    public double setPrice() {
        return bookPrice = 37.99;
    }
}
