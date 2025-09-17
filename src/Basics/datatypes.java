package Basics;

public class datatypes {
    static void main() {
        System.out.println("Data types tutorial!!");
        System.out.println("-------------------------------");

        //Date types ->
        // 1.Primitive Data Type
        // 2.Non-Primitive Data Type

        //Primitive Data types has 8 datatypes ->
        //1.byte -> 1 byte (for Smaller Number)
        //2.short -> 2 bytes (Medium Number)
        //3.int -> 4 bytes -> Big whole number
        //4.long -> 8 bytes (very Large Number)
        //5.float -> 4 bytes (Decimal Numbers)
        //6.double -> 8 bytes (More accurate decimals)
        //7.char -> 2 bytes (single Character)
        //8. boolean -> 1 bit (yes/No condition)

        byte smallNum = 100;
        short MidNum = 32000;
        int BigWholeNum = 100000;
        long VeryLargeNum = 1234567890L;
        float DecNum = 10.5f;
        double MoreAccurateDecNum = 25.9767;
        char name = 'A';
        boolean condition = true;

        System.out.println("1.Small Number : "+smallNum);
        System.out.println("2.Mid Number : "+MidNum);
        System.out.println("3.Big Whole Number : "+BigWholeNum);
        System.out.println("4.Very Large Num : "+VeryLargeNum);
        System.out.println("5.Float num : "+DecNum);
        System.out.println("6.Accurate Decimal is(double) : "+MoreAccurateDecNum);
        System.out.println("7.Character is : "+name);
        System.out.println("8.Condition is : "+condition);


        // Non - Primitive Data types ->
        // 1.strings - "Hello"
        //2.Arrays -> {1,2,3,4}
        //3.Classes - Students,Books,Car
        //4.Interfaces - like contracts for classes
        //5.Objects - Real thing created for class.


        String str = "Hello, I am string";
        System.out.println("String is : "+str);

        int[] arr = {1,2,3,4,5};
        for(int i=0;i<5;i++){
            System.out.print(arr[i]);
        }

    }
}
