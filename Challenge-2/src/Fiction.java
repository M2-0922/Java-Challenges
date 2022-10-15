public class Fiction extends Book {

    //constructor
    public Fiction(String bookTitle) {
        super(bookTitle);
        setPrice();
    }

    @Override
    public double setPrice() {
        return bookPrice = 24.99;
    }
    
}
