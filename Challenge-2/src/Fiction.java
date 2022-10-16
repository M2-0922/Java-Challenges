public class Fiction extends Book {

    public Fiction() {
    }

    public Fiction(String title, Double price) {
        super(title, price);
        setPrice();
    }

    @Override
    public void setPrice() {
        this.price = 24.99;
    }
}
