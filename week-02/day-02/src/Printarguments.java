public class Printarguments {
    public static void main(String[] args) {
        String[] myList ={"kutya","macska","disznó"} ;
        System.out.println(printer(myList));

    }

    public static String printer(String... input) {
        String all="";
        for (int i = 0; i < input.length; i++) {
            all += " "+ input[i];
        }
        return all;
    }
}

//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printer`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printer("first")
// printer("first", "second")
// printer("first", "second", "third", "fourh")
// ...