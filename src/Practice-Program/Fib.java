import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        System.out.println("-----Fibonacci Series Program-----");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        for(int i=num;i>=1;i--){
            System.out.print(i);
            System.out.print("+");
        }
    }
}
