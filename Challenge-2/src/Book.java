//Create an abstract class called Book

//Inside of the class 
//Create s string field for the book's title 
//Create a double field for the book price
//Create a constructor that requires the book title
//Create two methods
  //one that returns the title
  //one that returns the price
//Create an abstract method named `setPrice()`


public abstract class Book {
  private String title;
  protected double price;

  public Book(String title){
    this.title = title;
    this.price = 0.0;
  }

	public String getTitle() {
		return this.title;
	}

	public double getPrice() {
		return this.price;
	}

  public abstract void setPrice();
}
