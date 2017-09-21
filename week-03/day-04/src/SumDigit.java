public class SumDigit {

    public static void main(String[] args) {

        int n= 7;


        System.out.println(countingRecursion(n));
    }
    public static int countingRecursion(int n) {

        if (n < 10) {
            return n;
        } else {
            return n%10 + countingRecursion(n/10);
        }
    }
}
// Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while 
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).