import java.util.*;

public class QuoteSwap{
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        String temp=list.get(2);
        list.set(2,list.get(5));
        //arrayList.set(arrayList.indexOf(2),"Croissant");
        list.set(5,temp);

        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}

// what I cannot create, I do not udnderstand
// Accidentally I messed up this quote from Richard Feynman.
// Two words are out of place
// Your task is to fix it by swapping the right words with code

// Also, print the sentence to the output with spaces in between.