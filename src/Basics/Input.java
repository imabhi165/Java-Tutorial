
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
        System.out.println("Input in Java - Tutorial!!");
        System.out.println("---------------------------");
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num: ");
        int num = sc.nextInt();
        System.out.println("Enter Num is : " + num);
        System.out.print("Enter a Double Value: ");
        double num1 = sc.nextDouble();
        System.err.println("Entered Double num is: " + num1);
         */

        java.util.Scanner sc = new java.util.Scanner(System.in);
//       Int input
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine(); //this will clear New line

//      String Input
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

//    Char Input 
        System.out.print("Enter gender (M/F): ");
        char gender = sc.next().charAt(0);

        //Double Input 
        System.err.print("Enter Weight: ");
        double weight = sc.nextDouble();

        System.out.println("\n----------------------");
        System.out.println("Your Entered Input....");
        System.out.println("----------------------");
        System.out.println("Age: " + age);
        System.out.println("Name: " + str);
        System.out.println("Gender: " + gender);
        System.out.println("Weight: " + weight);
    }
}
