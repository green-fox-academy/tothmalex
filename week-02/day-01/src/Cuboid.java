public class Cuboid {
    public static void main(String[] args) {

        double a = 5;
        double b = 8;
        double c = 10;

        double Surface = 2 * a * b + 2 * a * c + 2 * b * c;
        double Volume = a * b * c;

        System.out.println("Surface Area: " + Surface);
        System.out.println("Volume: " + Volume);
    }
}


// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000
