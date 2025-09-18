
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        /*
        Input in Java -> java doesn't have cin or scanf like c/c++ .instead we use -> 1. a.Scanner(most commonly used) 2. b.bufferReader(Faster ,used when handling large input).
        --------------------------------------------------------------------------------
        Common Input method in Scanner -> 
        a. nextInt() -> Read an int Value
        b. nextDouble() -> Read a double value
        c. next() -> Read a single Word (String str = " Hello")
        d. nextLine() -> Read a Full word or sentence (String str = "Hello World!!")
        e. nextBoolean() -> Read a Boolean Value (true/false)
        f. nextFloat() -> Read a float value
        g. nextLong() -> Read a long value
        h. nextShort() -> Read a short Value
        i. nextByte() -> Read a byte Value
        ---------------------------------------------------------------------------------
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num: ");
        int num = sc.nextInt();
        System.out.println("Enter Num is : " + num);
        System.out.print("Enter a Double Value: ");
        double num1 = sc.nextDouble();
        System.err.println("Entered Double num is: " + num1);

    }
}
