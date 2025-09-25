public class Reverse {
    public static void main(String[] args) {

        /*------------------- Method 1----------------------------- 
        // Using String(Manual Method)-> It is fast and efficient but for Single-threaded apps
        String str = "Hello";
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i); //creates new object each time
        }
        System.out.println("Reversed: "+rev);
        ---------------------------------------------------------
        */

        /*----------------------Method 2-------------------------
        //  Using StringBuilder method (Recommended) -> It used multi-threaded Environments.
        String str = "I am Abhi";
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Reversed: "+sb.reverse());
        ---------------------------------------------------------
        */

        /*----------------------Method 3----------------------- */
        // Using Character Array
       String str = "Ashu";
       char[] arr = str.toCharArray();
       int j;
       int i=0;j=arr.length -1;
       while(i<j){
        char temp = arr[i];
        arr[j] = temp;
        i++;
        j--;
       }
       String rev = new String(arr);
       System.out.println("Reversed: "+rev);



    }
}