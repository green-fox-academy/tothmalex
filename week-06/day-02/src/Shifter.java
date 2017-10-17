public class Shifter implements CharSequence {

    String string;

    public Shifter(String string, int num) {
        this.string = string.substring(num);
    }

    @Override
    public int length() {
        return string.length();
    }

    @Override
    public char charAt(int index) {
        return string.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
