import java.util.*;

public class IsInList {
    public static void main(String... args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        ArrayList<Integer> Ilist = new ArrayList<Integer>(Arrays.asList(4, 8, 12, 16));

        if (list.containsAll(Ilist)) {
            System.out.println(true); }
            else{
            System.out.println(false);
        }
    }
}
