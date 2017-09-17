public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int currentpassedseconds = currentHours*3600+currentMinutes*60+currentSeconds;
        int dailySeconds= 86400;

        int secondsRemaining = dailySeconds-currentpassedseconds;

        System.out.println(secondsRemaining);
        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented bt the variables
    }
}