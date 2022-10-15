public class NonFiction extends Book {

    public NonFiction(String title) {
        this.title = title;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public double getPrice() {
        setPrice(37.99);
        return price;
    }

}
