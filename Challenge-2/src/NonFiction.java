public class NonFiction extends Book {

    public NonFiction(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        setPrice(37.99);
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
