package ex_016_Arrays;

public class Lab0159_2nd_Highest_Array {
    public static void main(String[] args) {
        int [] numbers = {12,45,67,23,89,45,89};
        int heighest = 0;
        int secondHeighest = 0;
        for(int num : numbers) {
            if (num > heighest) {
                secondHeighest = heighest;
                heighest = num;
            } else if (num > secondHeighest && num != heighest) {
                secondHeighest = num;
            }
        }
            System.out.println(secondHeighest);
            System.out.println(heighest);
        }
    }

