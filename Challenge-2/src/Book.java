public abstract class Book {
    //field
    private String bookTitle;    
    protected double bookPrice;

    //constructor
    public Book(String bookTitle){
        this.bookTitle = bookTitle;
    }

    //getter method
    public String getBookTitle() {
        return bookTitle;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    //abstract methid
    public abstract double setPrice();
}
