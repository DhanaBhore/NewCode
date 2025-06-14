package assignments;

public class MethCallDire {
public int add(int i, int j){
    return i + j;
}
}

class C{
    public static void main(String[] args) {
        MethCallDire m1 = new MethCallDire();
        m1.add(m1.add(10,20), m1.add(30,40));
    }
}