package ex_013_Functions;

import java.util.Scanner;

public class Lab0122_Function_Arth {
    public static void main(String[] args) {
        // create a function of sum, sub, mul and div
        // with parameter a and b(take the parameter from the  user)
        // Logic building
        // step 1 -> Inputs and outputs
        // a, b int scanner
        // int --> variable result

        // step 2  Rough logic - create function
        // function type 4th - with return and arguments parameters

        // step 3 write the code and find and fix edge cases
        Scanner scan = new Scanner(System.in);
        int a = readInt(scan, "Enter the num1");
        int b = readInt(scan, "Enter the num2");
      int result_sum = sum(a,b);
      int result_sub = sub(a,b);
      int result_mul = mul(a,b);
      int result_div = div(a,b);
      int result_mod = mod(a,b);
        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_div);
        System.out.println(result_mod);
    }
    static int readInt(Scanner scan, String prompt)
    {
        System.out.println(prompt);
        if(scan.hasNextInt())
        {
            return scan.nextInt();
        }
        else
        {
            System.out.println("Enter the int only");
            System.exit(0);
           // return  -1;
            return  0;
        }
    }
    static  int sum(int a, int b)
    {
        return a+b;
    }
    static int sub(int a, int b)
    {
        return a-b;
    }
    static int mul(int a, int b)
    {
        return a*b;
    }
    static  int div(int a, int b) throws ArithmeticException
    {
        if(b == 0)
        {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a/b;
    }
    static int mod(int a, int b)
    {
        return a%b;
    }
}
