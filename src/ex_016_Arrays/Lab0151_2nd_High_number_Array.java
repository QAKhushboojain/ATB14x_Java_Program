package ex_016_Arrays;

import java.util.Arrays;

public class Lab0151_2nd_High_number_Array {
    public static void main(String[] args) {
     int [] numbers = {12,34,10,1,100,3,4,32};
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);
    }
}
