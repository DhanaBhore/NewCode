package assignments;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        System.out.println("Enter the Number : ");

        Scanner scan = new Scanner(System.in);

        int Number = scan.nextInt();
        int No = Number;
        int sum = 0;

        while(Number > 0){
            int digit = Number % 10;
            sum = sum + (digit * digit * digit);
            Number = Number/10;
        }

        if(sum == No){
        System.out.println("This is Armstrong Number");}
        else{
        System.out.println("This is not Armstrong Number");
    }}}