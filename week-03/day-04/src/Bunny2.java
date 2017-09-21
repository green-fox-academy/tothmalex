public class Bunny2 {

    public static void main(String[] args) {

        int n = 12;
        int ears = 2;

        System.out.println(earsRecursion(ears, n));
    }

    public static int earsRecursion(int ears, int n) {

        if (n == 0) {
            return n;
        } else if (n % 2 == 1) {
            return (ears + earsRecursion(ears, n - 1));
        } else {
            return ((ears + 1) + earsRecursion(ears, n - 1));
        }
    }
}
// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).