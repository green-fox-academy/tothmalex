public class Dessert {

    double price; //int times int in the priceraise this is wgy the change is needed
    int sugar;

    public Dessert(double price, int sugar) {
        this.price = price;
        this.sugar = sugar;
    }

    public void raisePrice (int percentage) {
        price *= (1 + percentage / 100);
    }
}
