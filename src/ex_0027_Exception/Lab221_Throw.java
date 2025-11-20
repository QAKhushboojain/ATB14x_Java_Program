package ex_0027_Exception;

import java.util.Scanner;

public class Lab221_Throw {
    public static void main(String[] args) throws CustomException, ArithmeticException {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.next().equalsIgnoreCase("Khushboo")){
            //throw new CustomException("Bhag yha se Not allowed");
            throw  new ArithmeticException("Hehehe");
        }

    }
}
