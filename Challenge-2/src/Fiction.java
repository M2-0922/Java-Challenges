public class Fiction extends Book {
    // write your code here
    @Override
    public double setPrice() {
        return this.price = 24.99;
    }

    public Fiction () {

    }

    public Fiction (String title, double price) {
        super(title, price);
    }
}