public class Fiction extends Book{
    // write your code here
    public Fiction() {
    };

    public Fiction(String title, double price) {

	super(title, price);
    }

    public double setPrice() {

	return this.price = 24.99;
    }
}
