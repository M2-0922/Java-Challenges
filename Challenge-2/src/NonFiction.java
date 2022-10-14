public class NonFiction extends Book {
    public NonFiction(){};

    public NonFiction(String bookTitle){
        super(bookTitle);
        setPrice();

    }

    @Override
    public void setPrice() {
        bookPrice = 37.99;
    }

    // void showInfo(){
    //     System.out.println( "Title of nonfiction book: " + getBookTitle() );
    // }

}
