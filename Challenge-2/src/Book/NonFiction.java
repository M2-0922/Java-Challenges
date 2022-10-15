package Book;

public class NonFiction extends Book {

    public NonFiction() {
        this.setPrice();
    }

    public NonFiction(String title) {
        super(title);
        this.setPrice();
    }

    public void setPrice(){
        this.setPrice(37.99);
    }

}
