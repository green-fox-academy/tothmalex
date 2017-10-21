package sorting;

public class SortArray {

    public static void main(String[] args) {

        Integer [] myArray = {1,5,12,7,3,63,9,9,13,45,46};

        try {
            sort(myArray);
        } catch (Exception e) {
        } finally {
            for (int i = 0; i < myArray.length; i++) {
                System.out.print(myArray[i] + ", ");
            }
        }
    }

    public static <T extends Number> void sort(T[] list) throws Exception {
        T temp;

        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i].intValue() < list[j].intValue()) {
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
}