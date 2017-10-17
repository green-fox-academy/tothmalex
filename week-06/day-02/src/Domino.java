/*import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Domino implements Comparable implements Printable {

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    protected void printAllFields() {

        System.out.println();
    }


    public static void main(String[] args) {

            List<Domino> dominoes = new ArrayList<>();
            dominoes.add(new Domino(5, 2));
            dominoes.add(new Domino(4, 6));
            dominoes.add(new Domino(1, 5));
            dominoes.add(new Domino(6, 7));
            dominoes.add(new Domino(2, 4));
            dominoes.add(new Domino(7, 1));

            Collections.sort(dominoes);

            for(Domino d : dominoes) {
            d.printAllFields();
}
    }
}*/

// Should result in: [[1,5], [2,4], [4,6], [5,2], [6,7], [7,1]]
