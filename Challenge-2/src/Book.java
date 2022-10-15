abstract public class Book {

    //use protected access modify to use these field in other classes.
    protected String title;
    protected double price;

    //abstract method
    public abstract String getTitle();
    public abstract double getPrice();
    public abstract void setPrice(double price);

}