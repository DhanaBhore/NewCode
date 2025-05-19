package assignments;

import java.util.Scanner;

public class LargeValue {
    public static void main(String[] args) {

        System.out.println("Enter three numbers : ");

        Scanner scan = new Scanner(System.in);

        int Number1 = scan.nextInt();
        int Number2 = scan.nextInt();
        int Number3 = scan.nextInt();

        int[] arr = new int[3];
        arr[0] = Number1;
        arr[1] = Number2;
        arr[2] = Number3;

        int largest = arr[0];

        for(int i=0; i< arr.length; i++){

            if(largest<arr[i])
            {
                largest = arr[i];
            }
        }

        System.out.println("Largest value is : " +largest);
    }
}

