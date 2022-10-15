public class Fiction extends Book {

    public Fiction(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        setPrice(24.99);
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
