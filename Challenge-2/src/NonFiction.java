class NonFiction extends Book{
    // write your code here

    public NonFiction(String title) {
        super(title);
    }

    @Override
    public double setPrice(double price) {
        return 37.99;
    }

}