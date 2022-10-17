public abstract class Book {
    private String title;
    protected double price;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public double getPrice() {
        return this.price;
    }

    public void getFormattedCost() {
        System.out.println("Title-" + getTitle() + " Cost-$" + getPrice());
    }

    public abstract void setPrice();

    public abstract void getFormattedTitle();

}