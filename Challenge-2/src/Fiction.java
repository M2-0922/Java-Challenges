class Fiction extends Book {
    // write your code here

    public Fiction(String title) {
        super(title);
    }

    @Override
    public double setPrice(double price) {
        return 24.99;
    }

}