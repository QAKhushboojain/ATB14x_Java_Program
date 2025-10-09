package ex_0015_StringBuffer_builder_StringFunction;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab0141_Reverse_CharArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input string , I will reserve it");
        String user_input = scanner.next();
        String reserve_user_input = "";
        char[] array = user_input.toCharArray();
        for(int  i = array.length-1 ; i>= 0 ; i--)
        {
            reserve_user_input = reserve_user_input + array[i];
        }
        System.out.println(reserve_user_input);
    }
}
