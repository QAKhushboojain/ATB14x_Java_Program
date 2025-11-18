package ex_004_Operators;

public class Lab039_All_Operators {
    public static void main(String[] args) {
        // Arithmetic Operator
        boolean b1 = true ;
        int a = 10;
        int b = 20;
        System.out.println(a+b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a == b);
        System.out.println(a !=b);
        // compound operator
        int age= 10;
        age+= 10;  // += -> age + 10
        age-=10; // -= -> age - 10
        age/=10; // /= -> age / 10
        System.out.println(age);
    }
}
