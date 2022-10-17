public class NonFiction extends Book {
    public NonFiction(String title) {
        super(title);
        setPrice();
    }

    public void setPrice() {
        this.price = 37.99d;
    }

    @Override
    public void getFormattedTitle() {
        System.out.println("Title of non fiction book:");
        System.out.println(getTitle());
    }
}
