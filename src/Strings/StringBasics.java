
import java.util.Scanner;

public class StringBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // --------------------------------------------
        /*
        //1.next()
        System.out.println("Enter a String: ");
        String str = sc.next();
        System.out.println("Entered String is: " + str);
         */
        // ---------------------------------------------
        //2.nextLine()
        /*
        System.out.println("Enter a String: ");
        String str2 = sc.nextLine();
        System.out.println("Entered String is: " + str2);
         */
        // ---------------------------------------------

        /*
        //3.charAt() and length()
        //-------------------------------------------
        String str3 = "Hello";
        int len = str3.length();
        System.out.println("String Length: " + len);

        //If i want to print signle character of my StringArray -> for that we have to use charAt() functions.
        System.out.println(str3.charAt(0));
        System.out.println(str3.charAt(1));
        System.out.println(str3.charAt(2));
        System.out.println(str3.charAt(3));
        System.out.println(str3.charAt(4));
        //-------------------------------------------
       
        //4. indexOf() and compareTo()
        //-----------------------------
        System.out.println("Enter String: ");
        String str4 = sc.nextLine();
        int size = str4.length();
        String str5 = "Bikash";
        System.out.println("String Length: " + size);
        System.out.println(str4.indexOf('e'));
        System.out.println(str4.indexOf('l'));
        System.out.println(str4.indexOf('o'));
        System.out.println(str4.indexOf('z')); //if character not found then it will
        System.out.println("From here CompareTo() method Started....!!");
        System.out.println(str4.compareTo(str5));
  */
        /*
        * Important String Methods
        * str.length();
        * str.charAt();
        * str.toUpperCase();
        * str.toLowerCase();
        * str.concat(str2);
        * str.contains("Msg");
        * str.startsWith("java");
        * str.endWith("ing");
        * str.replace("Java", "C++");
        * str.substring(5);
         
        String str = "Java Programming";
        System.out.println(str.length());
        System.out.println(str.charAt(3));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.contains("gram"));
        System.out.println(str.startsWith("java"));
        System.out.println(str.endsWith("ing"));
        System.out.println(str.replace("Java", "C++"));
        System.out.println(str.substring(5));
*/

        // StringBuilder in Java -> Used to modify strings without creating new Objects.
        // it is mutable
        // faster than string in loops
        // Not thread-safe (means not safe for multithreaded apps)
        /* 
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5,"Java");
        sb.delete(0, 5);
        System.out.println(sb);
        */
        /*
         * Important StringBuilder Methods:
         * sb.append("text");  //Add at the End
         * sb.insert(2,"x"); //insert at position
         * sb.delete(1,3)  //removechars from index 1 to 2
         * sb.reverse();  //reverse the string
         * sb.replace(0,2, "Hi"); //replace chars from 0-1
         */


        //  3.StringBuffer in Java
        // same as StringBuilder 
        // but is is thread-safe
        // Slightly slower than StringBuilder
        // Example
        StringBuffer sb = new StringBuffer("Hi");
        sb.append(" Everyone");
        System.out.println(sb);





    }
}
