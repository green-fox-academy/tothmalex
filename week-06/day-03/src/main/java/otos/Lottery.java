package otos;



public class Lottery {

    public static void main(String[] args) {

        LotteryFilter lotto = new LotteryFilter();

        OptionParser parser = new OptionParser();
        parser.accepts("y").withRequiredArg();
        ;
        parser.accepts("f").withRequiredArg();
        parser.accepts("o").withRequiredArg();

        OptionSet options = parser.parse(args);

        if (options.has("a")) {
            System.out.println("`-a` was given with the argument " + options.valueOf("a"));
        }

        if (options.has("l")) {
            System.out.println("`-l` was given with the no additional information.");
        }
    }
}
