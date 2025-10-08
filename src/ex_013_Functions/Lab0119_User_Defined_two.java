package ex_013_Functions;

public class Lab0119_User_Defined_two {
    public static void main(String[] args) {
        int result = sum_of_two_number(3,  4);
        int result1 = sum_of_two_number(10, 45);
        int result2 = sum_of_two_number(333, 3333);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
    static int sum_of_two_number(int a, int b)
    {
        return a+b;
    }
    static void sum_of_two_number()
    {
        System.out.println("Hi, there");
    }
}
