package assignments;

import java.util.Scanner;

public class BreakLoop {
    public static void main(String[] args) {

        System.out.println("Enter the number : ");

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        while(true){
           if(i<0){
               System.out.println("Number less than 0 entered");
               break;
           }
        }
        }
}
