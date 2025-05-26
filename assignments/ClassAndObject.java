package assignments;

public class ClassAndObject {
    public static void main(String[] args) {
    Two t = new Two();
    int k = t.addition(4, 5);
        System.out.println(k);
    }
}


class Two{

    public int addition(int i, int j){
        int k = i+j;
        return k;
    }

}