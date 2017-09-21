public class Counter {

    public static void main(String[] args) {

        int n= 5;

        System.out.println(countingDown(n));
        System.out.println(countingRecursion(n));
    }
    public static String countingDown(int n) {
        String count = "";
        for (int i = n; i  > -1 ; i--) {
        count += i + " ";
        }
        return count;
        }
    public static int countingRecursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            System.out.println(n);
            return countingRecursion(n-1);
        }
    }
}



// Write a recursive function that takes one parameter: n and counts down from n.
