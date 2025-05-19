package assignments;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {

        System.out.println("Enter number : ");

        Scanner scan = new Scanner(System.in);

        int Number = scan.nextInt();

        if(Number>0){
            System.out.println("Number is positive");
        }
        else{
            System.out.println("Number is Negative");
        }
    }
}
