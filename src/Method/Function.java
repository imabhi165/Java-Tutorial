package Method;

public class Function {
    public void printHello(){
        System.out.println("Hello!!");
    }
    public int Addition(int a, int b){
        return a+b;
    }
    public int Subtraction(int a, int b){
        return a-b;
    }

    static void main(String[] args) {
        Function obj = new Function();
        obj.printHello();
        int result = obj.Addition(10,12);
        int result1 = obj.Subtraction(110,12);
        System.out.println(STR."Sum is: \{result}");
        System.out.println(STR."Difference is: \{result1}");
    }
}
