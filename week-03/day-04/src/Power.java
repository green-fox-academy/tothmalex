public class Power {

    public static void main(String[] args) {

        int base = 3;
        int n = 2;

        System.out.println(powerRecursion(base, n));
    }
    public static int powerRecursion(int base, int n) {

        if (n == 0) {
            return 1;
        } else {
           return (base * powerRecursion(base, n-1));
        }
    }
}

// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).