abstract public class Book {

    protected String title;
    protected double price;
    
    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    //abstract method
    public abstract String getTitle();
    public abstract void setTitle(String title);
    public abstract double getPrice();
    public abstract void setPrice(double price);

}