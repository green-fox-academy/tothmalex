public class Candy {

    int priceC;
    int sugarC;
    int numberC;

    public Candy() {
        this.priceC = 20;
        this.sugarC = 10;
        this.numberC = 0;
    }

    public void raiseC (int percentage) {

        this.priceC *= (1 + percentage / 100);
    }
}
