package src;

import src.Fiction;
import src.NonFiction;

public class App {
    public static void main(String[] args) throws Exception {
        // write your code here

        abstract class Book {
            String title;
            protected double price;

            public Book(String title) {
                this.title = title;
            }

            public String getTitle() {
                return title;
            }

            public double getPrice() {
                return price;
            }

            public abstract void setPrice();

        }

    }
}
