public class Fiction extends Book {
    public Fiction(){};

    public Fiction(String bookTitle){
        super(bookTitle);
        setPrice();

    }

    @Override
    public void setPrice() {
        bookPrice = 24.99;
    }
    // void showInfo(){
        // System.out.println( "Title of nonfiction book: " + getBookTitle() );
    // }
}
