package ex_0023_Super_Abstraction_SuperKeyword.SuperKeyword.Abstraction;

public class Lab0184_Interface_P1{
    public static void main(String[] args) {
        Car2 car2 = new Car2();
        car2.drive();
    }
}

class Car2 implements Breaks,Engine1{
    void drive(){
        startEngine();
        applyBreak();
        stopEngine();
    }
    @Override
    public void applyBreak() {

    }

    @Override
    public void startEngine() {

    }

    @Override
    public void stopEngine() {

    }
}

interface Breaks{
    void applyBreak();
    }

    interface Engine1{
void startEngine();
void stopEngine();
default void testEngine()
{
    System.out.println("Concrete Complete");
}
        default void testEngine1()
        {
            System.out.println("Concrete Complete");
        }

    }

