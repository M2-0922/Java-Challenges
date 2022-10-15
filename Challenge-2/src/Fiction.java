public class Fiction extends Book {
    
    public Fiction(String title) {
        this.title = title;
    }

    @Override
    public double getPrice() {
        setPrice(24.99);
        return price;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}
