public class CandyShop {

    Candy candy = new Candy();
    Lollipop lollipop = new Lollipop();

    int sugarAmount;
    int money = 0;
    int sugarPrice = 100;
    public static final int CANDY = 1;
    public static final int LOLLIPOP = 1;

    /*int CANDY = candy.numberC;
    int LOLLIPOP = lollipop.numberL;*/

    public CandyShop(int gram) {
        this.sugarAmount = 2000;
        this.money = money;
    }

    public void raise (int percentage){
        candy.raiseC(percentage);
        lollipop.raiseL (percentage);
    }

   /* public void createSweets (int increaseable) {
        increaseable += 1;
        if (increaseable == candy.numberC) {
            sugarAmount -= candy.sugarC;
        } else {
            sugarAmount -= lollipop.sugarL;
        }
    }*/

    /*public void createSweets (String increase) {
        if (increase.substring(increase.indexOf(".")) == "CANDY") {
            candy.numberC += CANDY;
            sugarAmount -= candy.sugarC;
        } else {
            lollipop.numberL += LOLLIPOP;
            sugarAmount -= lollipop.sugarL;
        }
    }

    public void sell (String reduction, int amount) {
        if (reduction.substring(reduction.indexOf(".")) == "CANDY"){
            candy.numberC -= amount;
            money += candy.priceC * amount;
        } else {
            lollipop.numberL -= amount;
            money += lollipop.priceL * amount;
        }
    }*/

    public void createSweets (int increase) {

    }

    public void sell (int reduction, int amount) {

    }

    public void buySugar (int amountSugar) {
        sugarAmount += amountSugar;
        money -= amountSugar / 1000 * sugarPrice;
    }
}
