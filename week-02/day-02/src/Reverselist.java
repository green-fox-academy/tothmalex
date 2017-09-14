public class Reverselist {
    public static void main(String[] args) {

        int[] aj = {3, 4, 5, 6, 7, 8};
        int temp;
        int a = aj.length - 1;


        for (int i = 0; i <= a /2; i++) {
            temp = aj[i];
            aj[i] = aj[a-i];
            aj[a - i] = temp;
        }
        for (int i = 0; i < aj.length; i++) {
            System.out.print(aj[i]+" ");
        }
    }
}


// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`
