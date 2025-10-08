package ex_013_Functions;

public class Lab0120_User_defined_Part1
{
    public static void main(String[] args) {
        // User Defined Functions :
        // 1. without parameters and without return types
        // 2. without parameters but with return type
        // 3. with parameters but without return type
        // 4. with parameters and with return types

        // 1. without argument parameters and without return type
        wop_wor_greet();
        // 2. without parameters and with return type
       String msg =  wop_wr_greet2();
        System.out.println(msg);

        // 3. with parameters and without return type
        greet_with_details("Khushboo", 65, 100);
        greet_with_details("Tashvi", 100, 120);

        // 4. with parameters with return type
        int sum = sum_of_two_numbers(3,4);
        int sum1 = sum_of_two_numbers(190, 900);
        int sum2  = sum_of_two_numbers(2345,5432);
        int sum3 = sum_of_three_numbers(2345, 5432, 5432);
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
    // 1. without parameters and without return types Declare/defination
    static void wop_wor_greet()
    {
        System.out.println("Hi, Type Function1");
        System.out.println("Hi, there");
    }
    // 2. without parameters but with return type
    static String wop_wr_greet2()
    {
        System.out.println("Hi, Type Function2");
        return "Hi,How are you?";
    }
    // 3. with parameters and without  return type(90%)
    static void greet_with_details(String name, int age, double salary)
    {
        System.out.println("Your Name"+ name  + "\n Your age" + age + "\nYour salary"+ salary);
    }
    // 4. with parameters and with return type
    static int sum_of_two_numbers(int a, int b)
    {
        return  a+b;
    }
    static int sum_of_three_numbers(int a, int b, int c)
    {
        return a+b+c;
    }
    static  float sum_of_three_numbers_of_float(float a, float b, float c)
    {
        return a+b+c;
    }
}
