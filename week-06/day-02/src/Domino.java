public class Domino implements Comparable<Domino>, Printable {
    private final int[] values;

    public Domino(int valueA, int valueB) {
        this.values = new int[]{valueA, valueB};
    }

    public int[] getValues() {
        return values;
    }

    @Override
    public String toString() {
        return "[" + values[0] + ", " + values[1] + "]";
    }

    @Override
    public int compareTo(Domino d) {
        int compareValue = d.values[0];
        int compareValue2 = d.values[1];
        if (this.values[0] - compareValue != 0) {
            return this.values[0] - compareValue;
        } else {
            return this.values[1] - compareValue2;
        }
    }

    @Override
    public void printAllFields() {
        System.out.println(this.values[0] + " " + this.values[1]);
    }
}