package method;

public class MethodDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
       int m = c1.addition(20, 30);
        System.out.println(m);

        int m1 = c1.subtract(50,40);
        System.out.println(m1);
    }


}
class Calculator{
        int addition (int i,int j) {
            int k = i + j;
            return k;
        }
           int subtract (int m,int n) {
               int l = m - n;
               return l;
        }
 }