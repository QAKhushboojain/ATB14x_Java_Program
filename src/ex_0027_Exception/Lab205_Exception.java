package ex_0027_Exception;

public class Lab205_Exception {
    public static void main(String[] args) {
        System.out.println("Start the Program");
        String ip = args[0]; // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
        int a = Integer.parseInt(ip); // Exception in thread "main" java.lang.NumberFormatException
        int b = 100/a; // Exception in thread "main" java.lang.ArithmeticException
        System.out.println(b);

        System.out.println("End the Program ");
    }
}
