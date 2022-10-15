package Book;

public class Fiction extends Book {

    public Fiction() {
        this.setPrice();
    }

    public Fiction(String title) {
        super(title);
        this.setPrice();
    }

    public void setPrice(){
        this.setPrice(24.99);
    }
    
}
