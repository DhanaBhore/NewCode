package assignments;

import java.util.Scanner;

public class NoOfDaysInMonth {
    public static void main(String[] args) {

        System.out.println("Input Month Number : ");

        Scanner scan = new Scanner(System.in);


        int MonthNumber = scan.nextInt();


        int NoOfDaysInMonth = 0;
        switch (MonthNumber){
            case 1:
            NoOfDaysInMonth = 31;
            break;

            case 2:
            NoOfDaysInMonth = 28;
            break;

            case 3:
            NoOfDaysInMonth = 31;
            break;

            case 4:
            NoOfDaysInMonth = 30;
            break;

            case 5:
            NoOfDaysInMonth = 31;
            break;

            case 6:
            NoOfDaysInMonth = 30;
            break;

            case 7:
            NoOfDaysInMonth = 31;
            break;

            case 8:
            NoOfDaysInMonth = 31;
            break;

            case 9:
            NoOfDaysInMonth = 30;
            break;

            case 10:
            NoOfDaysInMonth = 31;
            break;

            case 11:
            NoOfDaysInMonth = 30;
            break;

            case 12:
            NoOfDaysInMonth = 31;
            break;
        }
        System.out.println(NoOfDaysInMonth);
    }
}
