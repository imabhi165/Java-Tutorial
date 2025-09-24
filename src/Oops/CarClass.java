
public class CarClass { // This is the Car class

    // Fields of Class CAR
    String brand = "BMW";
    int speed = 100;

    void Drive() {
        System.out.println(brand + " is Driving at " + speed + " km/h");
    }

    public static void main(String[] args) {
        CarClass myCar = new CarClass(); // Create an object
        myCar.Drive(); // Call the instance method
    }
}
