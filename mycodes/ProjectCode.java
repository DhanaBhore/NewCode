package mycodes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ProjectCode {

    public static void main(String[] args) {

        System.out.println("Price of Sugar");
        Scanner scan = new Scanner(System.in);
        int Sugar = scan.nextInt();

        System.out.println("Price of Rice");
        Scanner Scan1 = new Scanner(System.in);
        int Rice = scan.nextInt();

        System.out.println("Price of Cashews");
        Scanner Scan2 = new Scanner(System.in);
        int Cashews = scan.nextInt();

        System.out.println("Price of Almonds");
        Scanner Scan3 = new Scanner(System.in);
        int Almonds = scan.nextInt();

        System.out.println("Price of Walnut");
        Scanner Scan4 = new Scanner(System.in);
        int Walnut = scan.nextInt();

        int a = (Sugar + Rice + Cashews + Almonds + Walnut);
        System.out.println("Total purchase amount = " + a);

        System.out.println("Amount received = ");
        Scanner Scan5 = new Scanner(System.in);
        int Cash_received = scan.nextInt();

        int b = Cash_received - a;
        System.out.println("Change amount to be given back : " + b);

        if (b < 0) {
            System.out.println("Insufficient funds");
        } else if (b == 0) {
            System.out.println("No change to be given back");
        } else {
            System.out.println("Change amount : " + b);
        }
        calculateChange(b);
    }
          public static void calculateChange(int b)
        {
           int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
           int[] counts = new int[denominations.length];

           for(int i = 0; i<denominations.length; i++)
           {
               counts[i] = (int)(b/denominations[i]);

               b%= denominations[i];
           }
            System.out.println("Change breakdown : ");

           for(int i = 0; i<denominations.length; i++)
           {
               if(counts[i] > 0)
               {
                   System.out.println(denominations[i] + "*" + counts[i] + "=" + (denominations[i]*counts[i]));
               }
           }
        }
    }
