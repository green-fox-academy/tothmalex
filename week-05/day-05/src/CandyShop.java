import java.util.ArrayList;

public class CandyShop {

    ArrayList<Dessert> storage = new ArrayList<>();

    double income;
    int sugarAmount;
    final static String CANDY = "candy";
    final static String LOLLIPOP = "lollipop";

    public CandyShop(int sugarAmountGramms) {   // ctrl P we can see parameters it requires
        sugarAmount = sugarAmountGramms;   // this is needed when method or parameter are called sugarAmount, confusing it could be
    }

    public void createSweets(String dessertType) {

        if (dessertType.equals("candy")) {
            storage.add(new Candy());
        } else {
            storage.add(new Lollipop());
        }
        sugarAmount -= storage.get(storage.size() - 1).price;
    }

    public void raise(int percentage) {
        for (Dessert dessert : storage) {
            dessert.raisePrice(percentage);
        }
    }

    public void sell(String dessertType, int amount) {

        for (int i = 0; i < amount; i++) {
            if (getDessert(dessertType) == null ){
                break;
            } else {
                income += getDessert(dessertType).price;
                storage.remove(getDessert(dessertType));
            }
        }
    }

    private Dessert getDessert(String dessertType) {
        for (int i = 0; i < storage.size(); i++) {
            if (storage.get(i) instanceof Lollipop && dessertType.equals("lollipop")) {
                return storage.get(i);
            } else if (storage.get(i) instanceof Candy && dessertType.equals("candy")) {
                return storage.get(i);
            }
        }
        return null;
    }

    public void buySugar (int gramms) {
        sugarAmount += gramms;
        income -= gramms * 0.1;
    }

    @Override
    public String toString() {
        return "Inventory: " + dessertCounter(CANDY) + " candies, " + dessertCounter(LOLLIPOP) +
                " lollipops, Income: " +  income + ", sugar: " + sugarAmount + "gramms";
    }

    private int dessertCounter(String dessertType) {
        int counter = 0;
        for (int i = 0; i < storage.size(); i++) {
            if (storage.get(i) instanceof Lollipop && dessertType.equals("lollipop")) {
                 return counter++;
            } else if (storage.get(i) instanceof Candy && dessertType.equals("candy")) {
                 return counter++;
            }
        }
        return counter;
    }
}
