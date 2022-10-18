public class Fiction extends Book {
    // write your code here
    public Fiction(){}

    Fiction(String title, double price) {
        super(title, price);
    }

    @Override
    public double setPrice() {
        return price = 24.99;
    }
}
