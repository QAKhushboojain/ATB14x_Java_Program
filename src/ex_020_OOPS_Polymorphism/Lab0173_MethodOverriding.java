package ex_020_OOPS_Polymorphism;
// Run time polymorphism
public class Lab0173_MethodOverriding {
    public static void main(String[] args) {
        Khushboo k  = new Khushboo();
        k.home();
        Father f1 = new Father();
        f1.home();
        Father f2 = new Khushboo(); // Dynamic Dispatch
        f2.home();
        // whoever object is it this is call
      //  Khushboo k1 = new Father();
        // when father is getting born child reference can  not be given to
    }
}
class Father {
    void home()
    {
        System.out.println("2BHK");
    }
}
class Khushboo extends Father{
    void home()
    {
        System.out.println("3BHK");
    }
}
