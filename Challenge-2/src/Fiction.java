public class Fiction extends Book{

public Fiction(String title){
    super(title);
    setPrice();
}

    @Override
    public void setPrice() {
        price = 24.99;
    }

    public void showInfo(){
        System.out.println("Title of fiction book: "+ getTitle() + " Cost-$" + getPrice());
    }


    
}
