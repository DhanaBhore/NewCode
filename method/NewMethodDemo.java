package method;

import jdk.dynalink.beans.StaticClass;

public class NewMethodDemo {
   public static void main(String[] args) {
        int m = Calc.addition(100, 100);
        System.out.println(m);

        int m1 = Calc.subtraction(5000, 2000);
        System.out.println(m1);

        double m2 = Calc.multiplication(3000, 2.7);
        System.out.println(m2);

        int m3 = Calc.division(40, 10000);
        System.out.println(m3);

        double m4 = Calc.square(10);
       System.out.println("Square = " + m4);

       double m5 = Calc.cube(20);
       System.out.println("Cube = " + m5);

    }

}


class Calc{
    static int addition (int i, int j){
        int k = i + j;
        return k;
    }
    static int subtraction(int l, int m) {
        int n = l - m;
        return n;
    }
   static double multiplication(int r, double s){
        double t = r * s;
        return t;
    }
    static int division(int x, int y){
        int z = y / x;
        return z;
    }
    static double square(int i){
        double a = multiplication(i, i);
        return a;
    }
    static double cube(int i){
        double b = multiplication(i, i);
      // double c = multiplication(b, i);
        return i*i*i;
    }
}