package ex_0023_Super_Abstraction_SuperKeyword.SuperKeyword.Abstraction;

public class Lab0181_Private {
}
class XYZ{
    XYZ()
    {

    }
    // private  int my_gold = 10;
    protected  int my_gold = 10;
}
class CAB extends XYZ{
    void display(){
        System.out.println(super.my_gold);
    }
}
