public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        int codinghours = 6;
        int semesterweeks = 17;
        int workDays = 5;
        int weeklyHours = 52;

        int hoursSpentCoding = codinghours * semesterweeks * workDays;
        System.out.println(hoursSpentCoding + " hours");

        int averageCoding = (hoursSpentCoding * 100) / (semesterweeks * weeklyHours);
        System.out.println(averageCoding + "%.");
    }
}