package CollectionFramework;
import java.util.ArrayList;

public class ArrayListExample {
    /*
    An Arraylist is a resizable array, which can be found in the java.util package.
    An Arraylist is a resizable array implementation of list interface. unlike arrays in java, which have a fixed length,
    an Arraylist can grow and shrink dynamically as elements are added or removed from it.This flexibility makes Arraylist a popular choice for storing collections of data
    when the size of the collection is not known in advance or when frequent insertions and deletions are required.
    */
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
      list.add(1);
      list.add(5);
      list.add(80);
      System.out.println(list.get(2));
      System.out.println(list);
      System.out.println("Size of this List is: "+list.size());
      for(int i=0;i<list.size();i++){
           System.out.println(list.get(i));
      }
      System.out.println("-------2nd Method to print------");
      //2nd Method 
      for(int x:list){
        System.out.println(x);
      }
      System.out.println("--------Contains Method-------");
      System.out.println(list.contains(20));
      System.out.println(list.contains(10));
      System.out.println(list.contains(80));
      System.out.println("-----------Add method-------");
      list.add(0,10);
      list.add(2,40);
      System.out.println(list);
      System.out.println("-----------set method-------");
      list.set(0, 20); //it will replace the previous value by 20;
      System.out.println(list);
    }
}
