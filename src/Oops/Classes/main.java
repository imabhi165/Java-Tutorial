package Classes;
import java.util.*;
class Students {
    int id;
    String n;

 //Added COnstructor to Initialize Both Fields
    public Students(int id, String n){
        //Added
        this.id = id;
        this.n = n;
    }
}


public class main {
    public static void main(String[] args) {
//        System.out.println("Hello World!!");

        //Creating Students objects using the new constructor
        Students s1 = new Students(10,"Abhishek");
        Students s2 = new Students(11,"Ashu");
        Students s3 = new Students(12,"bobby");
        System.out.println("Student Id is : "+s1.id);
        System.out.println("Student Name is : "+s1.n);
        System.out.println("Student Id is : "+s2.id);
        System.out.println("Student Name is : "+s2.n);
        System.out.println("Student Id is : "+s3.id);
        System.out.println("Student Name is : "+s3.n);


    }
}
