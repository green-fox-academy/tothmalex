public class Factorial {
    public static void main(String[] args) {
    int myNumber = 8;
    factorio(myNumber);
    }

    public static void factorio(int input) {
        if (input == 0) {
            int fact=1;
        }
        int fact = 1;
        for (int i = 1; i <= input; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
