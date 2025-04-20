package mycodes;

import java.util.Scanner;

public class TimeConversion {
        public static void main(String[] args) {
            System.out.println("Input minutes : ");

            Scanner scan = new Scanner(System.in);

            int minutes = scan.nextInt();
            int MinutesInAYear = 60*24*365;
            int Y = (minutes/MinutesInAYear);
            int D = (minutes/60/24)%365;

            System.out.println("No. of years are : " + Y +  " and No of days are : " + D);
        }
    }
