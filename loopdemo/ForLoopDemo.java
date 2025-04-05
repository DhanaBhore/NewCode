package loopdemo;

public class ForLoopDemo {
    public static void main(String[] args) {
       //print 1 to 10
        for (int i = 1; i <= 10; i++)
        {
            System.out.print(i);
        }
        System.out.println();

       /* pyramid_1
       for(int i=1; i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        } */

        for(int i=0; i<5;i++)
        {
            for(int j=5;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k = 0;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
