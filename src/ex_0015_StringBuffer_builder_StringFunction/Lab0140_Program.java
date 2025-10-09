package ex_0015_StringBuffer_builder_StringFunction;

import java.util.Scanner;

public class Lab0140_Program {
    public static void main(String[] args) {
        // write a program to reverse a string without using inbuilt functions
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input string, I will reverse it");
        String user_input = scanner.next();
      //  StringBuilder sb = new StringBuilder(user_input);
      //  System.out.println(sb.reverse());
        // khushboo - 7 user_input.length , charAt() -
        String reverse_user_input = "";
        for(int i = user_input.length()-1; i >= 0; i--)
        {
            reverse_user_input = reverse_user_input + user_input.charAt(i);
        }
        System.out.println(reverse_user_input);

    }
}
