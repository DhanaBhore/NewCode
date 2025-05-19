package assignments;

import java.util.Scanner;

public class WeekDayDislay {
    public static void main(String[] args) {

    System.out.println("Input Number : ");

    Scanner scan = new Scanner(System.in);

    int Number = scan.nextInt();

    String WeekDay = "";
        switch (Number){
        case 1:
            WeekDay = "Sunday";
            break;

        case 2:
            WeekDay = "Monday";
            break;

        case 3:
            WeekDay = "Tuesday";
            break;

        case 4:
            WeekDay = "Wednesday";
            break;

        case 5:
            WeekDay = "Thursday";
            break;

        case 6:
            WeekDay = "Friday";
            break;

        case 7:
            WeekDay = "Saturday";
            break;
    }
        System.out.println(WeekDay);
}
}
