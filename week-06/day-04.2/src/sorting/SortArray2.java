package sorting;

import java.util.Arrays;
import java.util.Collections;

public class SortArray2 {

    public static void main(String[] args) {
        Integer[] list = {14,25,4,35,47,3,0};
        sorting(list);
    }

    public static <T extends Number> void sorting (T[] list) {

        try {
            Arrays.sort(list, Collections.reverseOrder());
        } catch (Exception e) {
           e.printStackTrace();
        } finally {
            for (int i = 0; i < list.length; i++) {
               System.out.print(list[i] + ", ");
           }
        }
    }
}
