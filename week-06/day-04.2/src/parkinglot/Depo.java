package parkinglot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Depo {

    public static void main(String[] args) {

        List<Car> collection = new ArrayList<>();
        for (int i = 0; i < 256; i++) {
            collection.add(new Car());
        }

        Car.Brand[] brands = Car.Brand.values();
        Car.Color[] colors = Car.Color.values();
        int[][] carTypeAndColor = new int[brands.length][colors.length];
        for (int i = 0; i < collection.size(); i++) {
            for (int j = 0; j < brands.length; j++) {
                if (collection.get(i).brand.equals(brands[j])) {
                    for (int k = 0; k < colors.length; k++) {
                        if (collection.get(i).color.equals(colors[k])) {
                            carTypeAndColor[j][k]++;
                        }
                    }
                }
            }
        }

        int sumCars = 0;
        for (int i = 0; i < brands.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                sumCars += carTypeAndColor[i][j];
            }
            System.out.println(brands[i] + " = " + sumCars);
            sumCars = 0;
        }

        System.out.println();

        int sumColors = 0;
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < brands.length; j++) {
                sumColors += carTypeAndColor[j][i];
            }
            System.out.println(colors[i] + " = " + sumColors);
            sumColors = 0;
        }

        System.out.println();

        int maxRow = 0;
        int maxCol = 0;
        int maxValue = 0;
        for (int i = 0; i < brands.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                if (carTypeAndColor[i][j] > maxValue) {
                    maxValue = carTypeAndColor[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println(brands[maxRow] + " " + colors[maxCol] + " = " + carTypeAndColor[maxRow][maxCol]);
    }
}

/*
    Create a parkinglot.Car class with 2 enum properties
enum of car types
        The types of these cars or vehicles is up to you
enum of colors
        Create 256 Vehicles randomly and put them into a List
        Count and Print the number of same vehicles for each type
        Count and Print the number of same vehicles for each color
        Print the most frequently occurring vehicle*/
