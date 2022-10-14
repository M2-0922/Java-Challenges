public class Fiction extends Book {
    
    public Fiction(String title, double price) {
        super(title, price);
    }
    
    @Override
    public void setPrice() {
        System.out.println("Title-" + title + " Cost-$" + price);
    }

}
