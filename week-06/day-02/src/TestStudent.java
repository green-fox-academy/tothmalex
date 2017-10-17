public class TestStudent {

    public static void main(String[] args) {

        Student john = new Student("John Doe", 20, "male", "BME");

        try {
            Student johnTheClone = (Student) john.clone();
            System.out.println(johnTheClone.name + " " + johnTheClone.age);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
