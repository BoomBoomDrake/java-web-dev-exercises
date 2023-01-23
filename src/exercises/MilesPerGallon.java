package exercises;

import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles did you drive?:");

        float miles = input.nextFloat();

        System.out.println("How many gallons did you consume?:");

        float gallons = input.nextFloat();

        float mpg = miles / gallons;

        System.out.println("You mileage is " + mpg + " miles per gallon.");


    }
}
