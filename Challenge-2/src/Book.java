public abstract class Book {
    public String title;
    public Double price;

    public Book() {

    }

    public Book(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }

    public Double getPrice() {
        return this.price;
    }

    public abstract void setPrice();
}
