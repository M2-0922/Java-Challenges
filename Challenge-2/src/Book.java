abstract public class Book {

    protected String title;
    protected double price;

    public abstract String getTitle();

    public abstract double getPrice();

    public abstract void setPrice(double price);
}
