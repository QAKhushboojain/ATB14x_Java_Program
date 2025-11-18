package ex_0023_Super_Abstraction_SuperKeyword.SuperKeyword.Abstraction;

public class Lab0183_Better_Abatract_Class {
    public static void main(String[] args) {
        Alto a = new Alto();
        a.drive();
    }
}


    class Alto extends car1 implements tyre, Gear, Engine {
        void drive() {
            this.startCar();
            rubbertyre();
            blackColourDoToTyre();
            startEngine();
            changeGear();
            this.stopCar();
        }

        @Override
        void startCar() {
            System.out.println("Starting the car");
        }

        @Override
        void stopCar() {
            System.out.println("Stop the car");
        }

        @Override
        public void changeGear() {
            System.out.println("Change Gear the Car");
        }

        @Override
        public void rubbertyre() {
            System.out.println("Rubber Tyre the Car");
        }

        @Override
        public void blackColourDoToTyre() {
            System.out.println("BlackDoToTyre the Car");
        }

        @Override
        public void startEngine() {
            System.out.println("Starting Engine");
        }
    }

    interface tyre {
        abstract void rubbertyre();

        void blackColourDoToTyre();
    }

    interface Gear {
        void changeGear();
    }

    interface Engine {
        void startEngine();
    }

    abstract class car1 {
        abstract void startCar();

        abstract void stopCar();
    }

  //  abstract class A {

  //  }


