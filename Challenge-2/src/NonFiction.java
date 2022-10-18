public class NonFiction extends Book {
    // write your code here
    NonFiction(String title, double price) {
        super(title, price);
    }

    @Override
    public double setPrice() {
       return price = 37.99;
    }
}
