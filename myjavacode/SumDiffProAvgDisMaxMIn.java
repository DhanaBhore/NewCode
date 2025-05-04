package myjavacode;

public class SumDiffProAvgDisMaxMIn {
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
