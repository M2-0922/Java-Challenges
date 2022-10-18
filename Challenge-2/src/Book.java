/*
 * @author kubilaycakmak
 * @date Oct 17, 2022
 * @version 1.0
 */

public abstract class Book {
    private String title;
    private double price;
    
    public Book(String title) {
        this.title = title;
        this.price = setPrice(price);
    }
    
    public String getTitle() {
        return title;
    }
    
    public double getPrice() {
        return price;
    }
    
    public abstract double setPrice(double price);
}
