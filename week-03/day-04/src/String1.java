public class String1 {

    public static void main(String[] args) {
        System.out.println(string1("AlexX"));
    }
    public static String string1(String inputString) {
        if (inputString.length() == 0) {
            return "";
        }
        String firstChar = inputString.startsWith("x") ? "y" : inputString.substring(0, 1);
        return firstChar + string1(inputString.substring(1));
    }
}
// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.