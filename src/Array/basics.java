// package Array;

public class basics {

    public static void main(String[] args) {
        System.out.println("Array - Tutorial!!");
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Array size is : " + arr.length);
        System.out.println("Trasversing an Array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        /*  
         * Array is a collection of similar data types.
         * Array is a fixed size data structure.
         * Array index starts from 0.
         * Array can be one dimensional or multi dimensional.
         * Declaration of Array:
         * int[] arr; // preferred way -> 1st way
         * arr = new int[5]; // memory allocation
         * int arr[]; // valid but not preferred
         * int[] num = new int[5]; // declaration and memory allocation in single line
         * int [] num = {1, 2, 3, 4, 5}; // declaration, memory allocation and initialization in single line
         * int num[] = {1, 2, 3, 4, 5}; // valid but not preferred
         */
        /*  
         * Accessing Elements of Array:
         * arr[0] = 1;
         * arr[1] = 2;
         * arr[2] = 3;
         * arr[3] = 4;
         * arr[4] = 5;
         */
         int[] array = {1, 2, 3, 4, 5};
         System.out.println(array[0]); // 1
         System.out.println(array[1]); // 2     
         System.out.println(array[2]); // 3
         System.out.println(array[3]); // 4
         System.out.println(array[4]); // 5
    }

}
