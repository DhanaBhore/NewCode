package assignments;

class PrintNos2Betwn1To100 {
    public static void main(String[] args) {

        System.out.println("Divide by 3 :");

        for (int n = 1; n <= 100; n++) {
            if ( n % 3 == 0) {
                System.out.print(n + " ");
               System.out.println();

            }}

        System.out.println("Divide by 5 :");
        for (int n = 1; n <= 100; n++) {
            if (n % 5 == 0 ) {
                System.out.println(n+ " ");
            }}

        System.out.println("Divide by 3 and 5 : ");

        for (int n = 1; n <= 100; n++) {
            if (n % 5 == 0 && n % 3 == 0) {
                System.out.println(n + " ");

            }
        }
    }
}