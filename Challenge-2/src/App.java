public class App {
    public static void main(String[] args) throws Exception {
        // write your code here
    	Fiction fiction = new Fiction();
    	NonFiction nonfiction = new NonFiction();
    	
    	fiction.title = "Harry Potter";
    	nonfiction.title = "Calculus";
    	
    	String[][] bookArr = new String[2][3];
    	
    	// setting Array of book
    	getArray(bookArr, 0, fiction.getTile(), fiction.setPrice());
    	getArray(bookArr, 1, nonfiction.getTile(), nonfiction.setPrice());
    	
    	for(var data : bookArr) {
    		for(var i = 0; i < 2; i++) {
    			System.out.println(data[i]);
    		}
    	}
    	System.out.println(bookArr[0][2]);
    	System.out.println(bookArr[1][2]);
    	
    }

    /**
     * setting Array of book 
     *  @param bookArr : array to set data
     *  @param type : 0:fiction book, 1:nonfiction book
     *  @param title
     *  @param price
     *  
     * */
     public static void getArray(String[][] bookArr, int type, String title, double price) {

	     bookArr[type][0] = type == 0 ? "Title of fiction book:" : "Title of non fiction book:";
	     bookArr[type][1] = title;
	     bookArr[type][2] = "Title-" + title + " Cost-$" + String.valueOf(price);
     }
}
