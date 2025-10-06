public class Basics {
    private String Name;
    private int RollNo;
    private float Marks;

    //Constructor 

    public Basics(String Name, int RollNo, float Marks){
        this.Name = Name;
        this.RollNo = RollNo;
        this.Marks = Marks;
    }

    //methods
    public void DisplayInfo(){
        System.out.println("Name is: "+Name);
        System.out.println("Roll no is: "+RollNo);
        System.out.println("Marks is: "+Marks);
    }

    //Getter and Setter
    public String getName(){return Name;}
    public void setName(String Name){this.Name = Name;}
    public int getRollNumber() { return RollNo; }
    public void setRollNumber(int RollNo) { this.RollNo = RollNo; }
    public double getMarks() { return Marks; }
    public void setMarks(double Marks) { this.Marks = Marks; }

    public static void main(String[] args) {
        Student student1 = new Student("Alice", 101, 85.5);
        Student student2 = new Student("Bob", 102, 90.0);
        
        student1.displayInfo();
        System.out.println();
        student2.displayInfo();
}