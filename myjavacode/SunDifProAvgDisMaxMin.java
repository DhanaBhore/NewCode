package myjavacode;


import java.util.Arrays;

import static java.util.Arrays.*;

public class SunDifProAvgDisMaxMin {
    public static void main(String[] args) {

        Calculator Cal = new Calculator();
        int n = Cal.Addition(50, 60);
        System.out.println("Addition = " +n);

        int n1 = Cal.subtraction(950, 270);
        System.out.println("Difference = "+n1);

        int n2 = Cal.multiplication(75, 36);
        System.out.println("Product = "+n2);

        int n3 = Cal.average(45, 79);
        System.out.println("Average = "+n3);

        /*int n4 = Cal.max(4, 8,43,76);
        System.out.println("Maximum value = "+n4);

        int n5 = Cal. min(54, 91, 26, 11,100);
        System.out.println("Minimum value = "+n5);*/
    }
}


class Calculator {
    int Addition(int i, int j) {
        int k = i + j;
        return k;
    }

    int subtraction(int i, int j) {
        int k = i - j;
        return k;
    }

    int multiplication(int i, int j) {
        int k = i * j;
        return k;
    }

    int average(int i, int j) {
        int k = (i + j) / 2;
        return k;
    }
   //* int max(int i, int j, int k, int l){
       // int m = (i, j, k, l;)
       // return m;
    //}
   // int min(int i, int j, int k, int l, int m){
       // int n = (i, j, k, l, m);
       // return n;
    }
