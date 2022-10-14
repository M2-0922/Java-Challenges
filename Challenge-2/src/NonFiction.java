public class NonFiction extends Book{

    public NonFiction(String title){
        super(title);
        setPrice();
    }
    
        @Override
        public void setPrice() {
            price = 37.99;
        }
    
        public void showInfo(){
            System.out.println("Title of non fiction book: "+ getTitle() + " Cost-$" + getPrice());
        }
    
    
}
