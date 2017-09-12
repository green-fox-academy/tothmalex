public class Sum02 {
    public static void main(String[] args) {
        System.out.println(sum(6));
    }
    public static int sum(int till){
        int sumOfNumbers=0;
        for(int i=0; i<till; i++){
            sumOfNumbers += i;
        }
        return sumOfNumbers;
    }
}
