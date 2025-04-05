package method;

public class MethodDemo
{
    public static void main(String[] args)
    {
        Calculator c1 = new Calculator();
        int m = c1.addition(20, 30);
        System.out.println("m = " + m);

        int m1 = c1.subtraction(50, 40);
        System.out.println("m1 = " + m1);

        int m2 = c1.multiplication(200, 20);
        System.out.println("m2 = " + m2);

        int m3 = c1.division(20, 4000);
        System.out.println("m3 = " + m3);
    }
}

        class Calculator
        {

            int addition (int i, int j) {
            int k = i + j;
            return k;
            }

            int subtraction(int l, int m) {
            int n = l - m;
            return n;
            }

            int multiplication(int r, int s){
            int t = r * s;
            return t;
            }

            int division(int x, int y){
            int z = y / x;
            return z;
            }
        }