public class Bunny1 {

    public static void main(String[] args) {

        int n = 12;
        int ears = 2;

        System.out.println(earsRecursion(ears,n));
    }
    public static int earsRecursion(int ears, int n) {

        if (n == 0) {
            return n;
        } else {
            return (ears + earsRecursion(ears, n-1));
        }
    }
}
// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
