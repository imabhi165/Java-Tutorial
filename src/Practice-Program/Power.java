
import java.util.Scanner;

public class Power {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter First Number: ");
            int a = sc.nextInt();
            System.out.print("Enter Second Number: ");
            int b = sc.nextInt();

            int pow = 1;
            for (int i = 1; i <= b; i++) {
                pow *= a;
            }
            System.out.println("Power of " + a + " and " + b + " is: " + pow);
        }

    }
}
