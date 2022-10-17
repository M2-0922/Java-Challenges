public class Fiction extends Book {

    public Fiction(String title) {
        super(title);
        setPrice();
    }

    public void setPrice() {
        this.price = 24.99d;
    }

    @Override
    public void getFormattedTitle() {
        System.out.println("Title of fiction book:");
        System.out.println(getTitle());
    }
}
