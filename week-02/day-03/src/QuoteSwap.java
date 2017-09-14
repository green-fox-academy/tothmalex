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
