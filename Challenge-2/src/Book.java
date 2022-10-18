abstract public class Book {
    public String title;
    public double price; 

    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public Book(){}

    public String returnTitle() {
        return title;
    }

    public double returnPrice() {
        return price;
    }

    public abstract double setPrice();

}
