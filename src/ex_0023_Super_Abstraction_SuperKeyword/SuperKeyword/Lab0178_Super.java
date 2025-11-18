package ex_0023_Super_Abstraction_SuperKeyword.SuperKeyword;

public class Lab0178_Super {
}
class Father{
    Father()
    {
        System.out.println("Default Constructor");
    }
    int gold = 10;
    void Home()
    {
        System.out.println("Home Father");
    }
}
class Son extends Father{
    Son()
    {
        super();
    }
    int gold_c = 100;
    void bike(){}
    void newHome()
    {
        System.out.println(super.gold);
        super.Home();
        this.bike();
        System.out.println(this.gold_c);
    }
}
