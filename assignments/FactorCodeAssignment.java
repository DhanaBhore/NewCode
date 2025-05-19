package assignments;

import java.util.Scanner;

public class FactorCodeAssignment {

    public static void main(String[] args) {

        System.out.println("Enter the Number ");
        Scanner sc = new Scanner (System.in);
        int Number = sc.nextInt();

        for(int i=1; i<=Number; i++){
            if (Number%i ==0){
                System.out.println(i);}
        }
    }
}
