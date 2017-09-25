import java.util.ArrayList;

public class HashMapTrial2 {

    public static void main(String[] args) {

        ArrayList<String> listTree1 = new ArrayList<String>();
        ArrayList<String> listTree2 = new ArrayList<String>();
        ArrayList<String> listTree3 = new ArrayList<String>();
        ArrayList<String> listTree4 = new ArrayList<String>();
        ArrayList<String> listTree5 = new ArrayList<String>();

        listTree1.add("A");
        listTree1.add("Red");
                /*, "15", "Female");
        listTree2.add("A", "Red", "15", "Female");
        listTree3.add("Type: A, Leaf colour: Orange, Age: 17,Sex: Female");
        listTree4.add("Type: C, Leaf colour: Green, Age: 12,Sex: Female");
        listTree5.add("Type: A, Leaf colour: Red, Age: 12,Sex: Male"); */

        System.out.println("Tree 1:");
        System.out.println(listTree1.get(1));


       /*for (int i = 0; i <= 4; i++) {
            System.out.println("Tree 1:");
            System.out.println(listTree1.get(i));
            System.out.println("Tree 2:");
            System.out.println(listTree2.get(i));
            System.out.println("Tree 3:");
            System.out.println(listTree3.get(i));
            System.out.println("Tree 4:");
            System.out.println(listTree4.get(i));
            System.out.println("Tree 5:");
            System.out.println(listTree5.get(i));
        } */
    }
}