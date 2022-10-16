public class NonFiction extends Book {

    public NonFiction() {
    }

    public NonFiction(String title, Double price) {
        super(title, price);
        setPrice();
    }

    @Override
    public void setPrice() {
        this.price = 37.99;
    }

}
