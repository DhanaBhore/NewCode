import java.util.Scanner;

public class MainScanner
{
        public static void main(String[] args) {
                System.out.println("Input seconds : ");

        Scanner scan = new Scanner(System.in);

        int seconds = scan.nextInt();
        int S = seconds % 60; //59
        int H = seconds / 60;

        int M = H % 60;
                H = H / 60;
        System.out.println(H + ":" + M + ":" + S);
    }
}


