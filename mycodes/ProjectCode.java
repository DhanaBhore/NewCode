package mycodes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ProjectCode {

    public static void main(String[] args) {

        System.out.println("Price of Sugar");
        Scanner scan = new Scanner(System.in);
        int Sugar = scan.nextInt();

        System.out.println("Price of Rice");
        int Rice = scan.nextInt();

        System.out.println("Price of Cashews");
        int Cashews = scan.nextInt();

        System.out.println("Price of Almonds");
        int Almonds = scan.nextInt();

        System.out.println("Price of Walnut");
        int Walnut = scan.nextInt();

        int total_amount = Sugar + Rice + Cashews + Almonds + Walnut;
        System.out.println("Total purchase amount = " + total_amount);

        System.out.println("Amount received from the customer = ");
        int Cash_received = scan.nextInt();

        int change = Cash_received - total_amount;
        System.out.println("Change amount to be given back : " + change);

        if (change < 0) {
            System.out.println("Insufficient funds");
        } else if (change == 0) {
            System.out.println("No change to be given back");
        } else {
            System.out.println("Change amount : " + change);
        }
        calculateChange(change);
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
