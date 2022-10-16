// public class Fiction {
//     // write your code here

// }

package src;

import src.App;


class Fiction extends Book {

    public Fiction(String title) {
        super(title);

    }

    @Override
    public void setPrice() {
        price = 24.99;
    }
}
