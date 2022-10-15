package Book;

public abstract class Book {
    private String title;
    private double price;

    public Book(){}

    public Book(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public abstract void setPrice();

    public static String display(Book[] book){

        String result_divider = new String("```\n");
        String result_title = new String();
        String result_price = new String();

        for(int i = 0; i < book.length; i++){
            if(book[i] instanceof Fiction){
                result_title += "Title of fiction book:\n" + book[i].getTitle() + "\n";
            }else{
                result_title += "Title of non fiction book:\n" + book[i].getTitle() + "\n";
            }
            result_price += "Title-" + book[i].getTitle() + " Cost-$" + String.format("%.2f",book[i].getPrice()) + "\n";
        }
        
        return result_divider + result_title + result_price + result_divider;
    }

}
