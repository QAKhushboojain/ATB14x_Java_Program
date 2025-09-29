package ex_011_While_Loop;

import java.util.Scanner;

public class Lab0110_while_IQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for Factorial Program");
        if(!scanner.hasNextInt())
        {
            System.out.println("You Fool, Integer only");
        }
        else
        {
            int number = scanner.nextInt();
            int fact = 1;
            if(number == 0)
            {
                fact = 1;
                System.out.println("Fact = 1");
            }
            if(number < 0 || number > Integer.MAX_VALUE)
            {
                System.out.println("can't get the factorial as out of bound!(int)");
            }
            int i = 1;
            while (i <= number)
            {
                fact = fact*i;
                i++;
            }
            System.out.println(fact);
        }
    }
}
