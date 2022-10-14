public abstract class Book {
  private String bookTitle;
  protected double bookPrice;

  // Default constructor
  public Book(){};

  // Parameter constructor
  public Book(String bookTitle){
    this.bookTitle=bookTitle;
    this.bookPrice=0.0;
  }

  // Getter and Setter
  public String getBookTitle() {
		return bookTitle;
	}

	public double getBookPrice() {
		return bookPrice;
	}

  // Abstract method
  public abstract void setPrice();
  
}
