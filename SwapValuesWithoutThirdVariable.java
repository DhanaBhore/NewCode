public class SwapValuesWithoutThirdVariable {
    public static void main(String[] args) {

        int i = 10;
        int j = 7;

        int k = i / j;
        i = k * j;
        j = k * 10;

        System.out.println(i);
        System.out.println(j);
    }
}