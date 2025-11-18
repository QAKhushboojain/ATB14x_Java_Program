package ex_0023_Super_Abstraction_SuperKeyword.SuperKeyword.Abstraction;

public class Lab0182_Abstract {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.loan50k();
        s1.loan10k();
    }
}
abstract  class AmitFather{
abstract void loan50k();
void loan10k()
{
    System.out.println("Given");
}
}
class Son extends AmitFather{
    @Override
    void loan50k() {
        System.out.println("OK, I am Amit, I will give the Father loan of 50k");
    }
}
