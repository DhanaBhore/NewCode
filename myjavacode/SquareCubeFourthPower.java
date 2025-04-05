package myjavacode;

import java.util.Scanner;

public class SquareCubeFourthPower {

    public static void main(String[] args) {

        System.out.println("Input number : ");

        Scanner scan = new Scanner(System.in);

      int i = scan.nextInt();

        int S = i*i;

        int C = i*i*i;

        int F = i*i*i*i;


        System.out.println("Square : "+S);
        System.out.println("Cube : "+C);
        System.out.println("Fourth power : "+F);
    }

}

