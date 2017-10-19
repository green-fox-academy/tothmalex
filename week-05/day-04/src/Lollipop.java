public class Lollipop {

    int priceL;
    int sugarL;
    int numberL;

    public Lollipop() {
        this.priceL = 10;
        this.sugarL = 5;
        this.numberL = 0;
    }

    public void raiseL (int percentage) {

        this.priceL *= (1 + percentage / 100);
    }
}
