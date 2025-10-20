package ex_019_Inheritance.MultilevelInheritance;

public class Lab169_Multi_level {
    public static void main(String[] args) {
        Son khushboo = new Son();
        khushboo.Home();
        khushboo.bhk3();
        khushboo.gf();
        khushboo.extra();
        Father f1 = new Father();
        f1.gf();
        f1.Home();
        f1.extra();
        GrandFather gf = new GrandFather();
        gf.gf();
        gf.Home();
        // Dynamic Dispatch
        GrandFather g1 = new Son();
        Father f2 = new Son();
        //  Son s1 = new GrandFather();
       //  Son s2 = new Father();
    }
}
