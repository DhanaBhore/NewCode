package assignments;

public class StatNonStat {
    public static void main(String[] args) {
        Two t = new Two();
        int m = t.addition(20, 30);
        System.out.println("m = " + m);

        int m1 = Two.multiplication(3000, 2);
        System.out.println("M1 = " +m1);
    }
}


class Two{

    int addition (int i, int j) {
        int k = i + j;
        return k;
    }
    static int multiplication(int r, int s){
        int t = r * s;
        return t;
    }
}