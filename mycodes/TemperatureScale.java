package mycodes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TemperatureScale
{
    public static void main(String[] args)
    {
        System.out.println("Inut temerature in Celcius: ");

        Scanner scan = new Scanner(System.in);

        double d = scan.nextDouble();
        System.out.println("Outut: ");

        double s = CelsiustoFarenhite(d);
        double t = CelsiustoKelvin(d);
    }

    private static double CelsiustoKelvin(double d)
    {
        double K = d +273.15;
        System.out.println(d+ " Celcius = " +K+" Kelvin");
        return K;
    }

    private static double CelsiustoFarenhite(double d)
    {
        double F = (d*9/5)+32;
        System.out.println(d+ " Celcius = " +F+" Farenhite");
        return F;
    }
}
