package mycodes;

public class MethodOverloadingDemo {
    public static void main(String[] args) {

        double SC = ScientificCalculator.add(1.67, 2.4);

        System.out.println("Result = " +SC);

    }
}

class ScientificCalculator{

    public static int add(int a, int b){
        return a+b;
    }

    public static double add(double d1, double d2){
        return d1+d2;
    }

    public static int add(int a, int b, int c){
        return a+b+c;
    }
}
