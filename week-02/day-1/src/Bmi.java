public class Bmi {
    public static void main(String[] args) {

        double massInKg = 81.2;
        double heightInM = 1.78;
        double square = heightInM*heightInM;

        double bmi = (massInKg/square);

        System.out.println(bmi);
    }
}

// Print the Body mass index (BMI) based on these values