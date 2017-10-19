package sorting;

public class SortArray {

    public static void main(String[] args) {

        Integer [] myArray = {1,12,7,3,63,9,9,13,45,46};

        try {
            sort(myArray);
        } catch (Exception e) {
        } finally {
            for (int i = 0; i < myArray.length; i++) {
                System.out.print(myArray[i] + ", ");
            }
        }
    }

    public static <T extends Number> T[] sort(T[] list) throws Exception {
        T temp;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length - i - 1; j++) {
                if (list[j].intValue() < list[j + 1].intValue()) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        return list;
    }
}