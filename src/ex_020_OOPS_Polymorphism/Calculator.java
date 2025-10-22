package ex_020_OOPS_Polymorphism;

public class Calculator {
    public static void main(String[] args) {
        Calc c1 = new Calc();
        c1.add(3,4);
        c1.add(3.45, 4.78);

    }
}
class Calc{
    int add(int a, int b)
    {
        return a+b;
    }
    int add(int a, int b, int c)
    {
        return a+b+c;
    }
    double add(double a, double b)
    {
        return a+b;
    }
    long add(long a, long b)
    {
        return a+b;
    }
}
