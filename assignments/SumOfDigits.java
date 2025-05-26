package assignments;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        System.out.println("Enter the Number : ");

        Scanner scan = new Scanner(System.in);

        int Number = scan.nextInt();
        int no = Number;
        int sum = 0;

        while(no != 0){
            int digit = no % 10;
            sum += digit;
            no /= 10;
        }
            System.out.println("Sum of all the digits is : " +sum);
        }

    }

