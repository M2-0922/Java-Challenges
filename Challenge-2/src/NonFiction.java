public class NonFiction extends Book {

    public NonFiction(String title, double price) {
        super(title, price);
    }
    
    @Override
    public void setPrice() {
        System.out.println("Title-" + title + " Cost-$" + price);
    }
    
}
