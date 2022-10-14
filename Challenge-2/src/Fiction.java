//Create two child classes of Book: `Fiction` and `NonFiction`
//Within the constructors for the Fiction and NonFiction classes, call setPrice so all Fiction Books cost `$24.99` and all Non Fiction Books cost `$37.99`.


public class Fiction extends Book{
    public Fiction(String title) {
        super(title);
        setPrice();
    }

    @Override
    public void setPrice() {
        price = 24.99;
    }
}
