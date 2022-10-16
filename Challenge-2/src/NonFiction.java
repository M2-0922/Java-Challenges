// public class NonFiction {
// // write your code here

// }

package src;

import src.App;

class NonFiction extends Book {

    public NonFiction(String title) {
        super(title);

    }

    @Override
    public void setPrice() {
        price = 37.99;
    }
}
