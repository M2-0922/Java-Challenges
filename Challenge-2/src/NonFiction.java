public class NonFiction extends Book {
    // write your code here
    public NonFiction() {
    }

    public NonFiction(String title, double price) {
        super(title, price);
    }

    @Override
    public void setPrice() {
        this.price = 37.99;
    }
}
