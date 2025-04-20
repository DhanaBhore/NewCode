package mycodes;

import java.util.Scanner;

public class TemperatureScale {

    public static void main(String[] args) {

        System.out.println("Input : ");

        Scanner scan = new Scanner(System.in);

        double Meters = scan.nextInt();

        double Inch = 0.0254;

        double M = (Meters*Inch);

        System.out.println("Your answer is : " + M);
    }
}
