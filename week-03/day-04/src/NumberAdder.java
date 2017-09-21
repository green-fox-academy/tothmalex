public class NumberAdder {

    public static void main(String[] args) {

        int n= 5;

        System.out.println(countingRecursion(n));
    }

    public static int countingRecursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + countingRecursion(n-1);
        }
    }
}

// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.