package assignments;

public class MethodChaining {

    MethodChaining method1(){
        return this;
    }
    MethodChaining method2(){
        return this;
    }
}

class Demo{
    public static void main(String[] args) {
        MethodChaining m1 =  new MethodChaining();
        m1.method1().method2();
    }
}