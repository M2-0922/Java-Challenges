public class NonFiction extends Book {
    // write your code here
    @Override
    public double setPrice() {
        return price = 37.99;
    }

    public NonFiction () {

    }

    public NonFiction (String title, double price) {
        super(title, price);
    }

}
