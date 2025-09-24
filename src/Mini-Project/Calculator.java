
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("Calculator Program....");
        System.out.println("-----------------------");

        System.out.print("Enter First Number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter Second Number: ");
        double num2 = sc.nextDouble();

        System.out.println("Choose Operations (+,-,*,/,%): ");
        char operator = sc.next().charAt(0);
        double result;

        switch (operator) {
            case '+' -> {
                result = num1 + num2;
                System.out.println("Result: " + result);
            }
            case '-' -> {
                if (num1 > num2) {
                    result = num1 - num2;
                } else {
                    result = num2 - num1;
                }
                System.out.println("Result: " + result);
            }
            case '*' -> {
                result = num1 * num2;
                System.out.println("Result: " + result);
            }
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Error:Division by Zero");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
            }
            case '%' -> {
                if (num2 == 0) {
                    System.out.println("Error:Modulus by Zero");
                } else {
                    result = num1 % num2;
                    System.out.println("Result: " + result);
                }
            }
            default -> System.out.println("Invalid Operator");
        }
        sc.close();

    }
}
