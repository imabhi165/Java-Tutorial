// package Basics;

public class Operators {

    public static void main(String[] args) {
        System.out.println("------------------------------------");
        System.out.println("Operators and Variables Tutorials!!");
        System.out.println("------------------------------------");
        /*----------------------------------------------------------      
        Variables -> A variable is a container used to store values.
        ----------------------------------------------------------- 
         */
        int age = 25;  //here age is variable
        float price = 99.99f; //price is variable
        char grade = 'A'; //grade is variable
        boolean isPassed = true; //isPassed is variable
        String name = "Abhishek"; //name is variable

        System.out.println("Age is: " + age);
        System.out.println("Price is: " + price);
        System.out.println("Grade is: " + grade);
        System.out.println("Ispassed is: " + isPassed);
        System.out.println("Name is: " + name);
        /*-----------------------------------------------------------------------------------------------------------------------------------------------------
      operators -> Opertors are special symbols in java that perform operations on variables and values . they are fundamental to programming logic.
      1.Arithmetic Operators
      2.Relational Operators
      3.Logical Operators
      4.Assignment Operators
      5.unary operators
      6.Bitwise operators
      7.Ternary Operators

      Arithmetic Operators  
      1.Addition  -> (+)
      2.subtraction -> (-)
      3.Multiplication -> (*)
      4.Division  -> (/)
      5.Modulus(Remainder) -> (%)
      ----------------------------------------------------------------------------------------------------------------------------------------------------------
         */

        int a = 100;
        int b = 25;
        System.out.println("--------------------------");
        System.out.println("1.Arithmetic Operators....");
        System.out.println("--------------------------");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modules: " + (a % b));

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------
        2.Relational(comparison) Operators -> used to compare two values , returns a boolean result
        1. equal to (==) return true value
        2. not equal to (!=) return true if true or if not , return false
        3. Greater than (>)
        4.less than (<)
        5. Greater or equal to (>=)
        6.Less or equal (<=)
        --------------------------------------------------------------------------------------------------------------------------------------------------------
         */
        System.out.println("--------------------------");
        System.out.println("2.Relational Operators....");
        System.out.println("--------------------------");
        System.out.println(a == b);  //False
        System.out.println(a != b);  //true
        System.out.println(a > b);  //true
        System.out.println(a < b); //false
        System.out.println(a >= b); //true
        System.out.println(a <= b);  //false

        /*----------------------------------------------------------------------------------------------------------------------------------------------------
        3.Logical Operators -> used for combine multiple boolean expressions
        a. && -> Logical AND -> true or false
        b. ! -> Logical NOT -> !true -> false
        ------------------------------------------------------------------------------------------------------------------------------------------------------
         */
        System.out.println("--------------------------");
        System.out.println("3.Logical Operators....");
        System.out.println("--------------------------");

        boolean isAbletoMarry = true;
        if (age >= 18 && isAbletoMarry) {
            System.out.println("Eligible to marry");
        }

    }
}
