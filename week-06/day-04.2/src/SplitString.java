import java.util.Arrays;

public class SplitString {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(splitter("barbara", 4)));
    }

    public static String[] splitter(String input, Integer number) {

        try {
            String firstWord = input.substring(0, number - 1);
            String secondWord = input.substring(number, input.length());
            String[] splitterArray = {firstWord, secondWord};
            return splitterArray;
        } catch (Exception e) {
            System.out.println("OutOfBoundException");
        }
        return null;
    }
}

  /*  Write a function that receives a string and an integer
    The function should return an array of strings, with two string in it
        The first string should be the first part of the original string
        Characters in range [0,index-1].
        The second part should be the rest of the string characters range [index,length-1]
        Example: split("lovebarbara", 4)
        Result: {"love", "barbara"}
        Handle the exception if the index is out of bounds*/