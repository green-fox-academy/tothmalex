public class Fibonacci {

    public int fib(int n) {

        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}

/*
    Write a function that computes a member of the fibonacci sequence by a given index
        Create tests that covers all types of input (like in the previous workshop exercise)*/
