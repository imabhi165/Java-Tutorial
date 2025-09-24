
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {

    public static void main(String[] args) throws IOException {
        System.out.println("BufferReader Tutorial....");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String str = br.readLine(); //it will read full  line
        // int num = Integer.parseInt(str); //convert to int.

        System.out.println("Enter your city: ");
        String city = br.readLine();
        System.out.println("Enter your Pin code: ");
        int pin = Integer.parseInt(br.readLine());
        System.out.println("city: " + city + ", Pincode: " + pin);
    }
}
