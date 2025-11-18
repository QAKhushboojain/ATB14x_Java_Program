package ex_0023_Super_Abstraction_SuperKeyword.SuperKeyword.Abstraction;

public class Lab0179 {
    public static void main(String[] args) {
        // Car
        Car tesla = new Car();
        tesla.drive();
    }
}
class vehicle{
    public  int maxSpeed = 180;
    void noTest()
    {
        System.out.println("Empty");
    }
    vehicle()
    {
        System.out.println("Default Constructor");
    }
    vehicle(int a)
    {
        System.out.println("Parameterized Constructor");
    }
    vehicle(int a, int b)
    {
        System.out.println("Parameterized Constructor");
    }
    // Method Overloading - same name function with different argument
    void message()
    {
        System.out.println("No return , No argument");
    }
    void message(int a)
    {
        System.out.println("PC - argument");
    }
    void drive()
    {
        System.out.println("vehicle Parent");
    }
}
class Car extends vehicle{
    private int maxSpeed = 281;
    Car(){
        super(100);
    }
    Car(int a)
    {
        System.out.println("Parameterized Constructor");
    }
    void test()
    {}

    @Override
    void drive() {
        System.out.println("Over ridden the vehicle");
        System.out.println(super.maxSpeed);
        System.out.println(this.maxSpeed);
        super.noTest();
        this.test();
    }


}
