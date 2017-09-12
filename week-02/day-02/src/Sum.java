public class Sum {
    public static void main(String[] args) {
        int myNumber = 6;
        sum(myNumber);
    }

    public static void sum(int input) {
        int num = 0;
        for (int i = 1; i < input; i++) {
            num += i;
        }
        System.out.println(num);
    }
}
