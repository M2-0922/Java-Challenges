public class App {
    public static void main(String[] args) throws Exception {
        abstract class Book {
            private String title;
            private double price;

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

        public class Books {
            public static void main(String[] args) {
                Fiction Fiction = new Fiction("Fiction Book");
                Fiction.setPrice();
                NonFiction NonFiction = new NonFiction("Non Fiction Book");
                NonFiction.setPrice();
                System.out.println("Title: " + Fiction.getTitle());
                System.out.println("Title: " + Fiction.getPrice());

                System.out.println("Title: " + NonFiction.getTitle());
                System.out.println("Title: " + NonFiction.getPrice());
            }
        }
    }
}
