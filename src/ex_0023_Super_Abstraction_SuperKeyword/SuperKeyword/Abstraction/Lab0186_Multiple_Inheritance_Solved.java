package ex_0023_Super_Abstraction_SuperKeyword.SuperKeyword.Abstraction;

public class Lab0186_Multiple_Inheritance_Solved {
}
class Child1 implements Father1, Father2{

    @Override
    public void money() {
        System.out.println("Child Money");
    }
}
interface Father1{
    final int a = 10;
    void money();
}
interface Father2{
    void money();
}
