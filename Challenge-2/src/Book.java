public abstract class Book {
    public String title;
    public double price;

    public Book() {

    }

    public Book (String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }

    public double getPrice() {
        return this.price;
    }

    public abstract double setPrice();

}