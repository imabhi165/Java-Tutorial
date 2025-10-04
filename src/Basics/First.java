// package Basics;

import static java.lang.System.exit;
import java.util.Scanner;

public class First {

    public static void main(String[] args) {
//        System.out.println("Hello World!!");

//        int[] array = {1,2,3,4,5};
//        int size = array.length;
//        System.out.println("Size of Array is : "+size);
//
//        for(int i=0;i<size;i++){
//            System.out.println("The Element of Array is : "+array[i]);
//        }
        //Sum of Array Elements
//        int sum=0;
//        for(int i=0;i<size;i++){
//            sum = sum + array[i];
//        }
//        System.out.println("The Sum of Array Element is : "+sum);
        System.out.println("*******************      MENU ITEMS     ***********************");
        System.out.println("1.Sum");
        System.out.println("2.Subtraction");
        System.out.println("3.Divide");
        System.out.println("4.Multiply");
        System.out.println("5.Exit");
        System.out.println("*******************      Select Item    ***********************");
        System.out.print("Please Choose the Choice : ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                int a,
                 b;
                System.out.print("Please Enter Two Numbers : ");
                a = scanner.nextInt();
                b = scanner.nextInt();
                int result = a + b;
                System.out.println("The Sum of is: " + result);
                break;

            case 2:
                int x,
                 y;
                System.out.print("Please Enter Two Numbers : ");
                x = scanner.nextInt();
                y = scanner.nextInt();
                int sub = x - y;
                System.out.println("The Sub is: " + sub);
                break;

            case 3:
//                multiply();
                break;

            case 4:
//                divide();
                break;

            case 5:
                exit(0);
                System.out.println("Successfully Exited....");
                break;
            default:
                System.out.println("Please Choose Valid Entity...");
                break;
        }
    }
}
