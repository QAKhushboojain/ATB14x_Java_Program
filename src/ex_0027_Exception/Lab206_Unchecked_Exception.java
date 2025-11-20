package ex_0027_Exception;

public class Lab206_Unchecked_Exception {
    public static void main(String[] args) {
        int a = 0;
        int b = 10;
        int c = b/a; // java.lang.ArithmeticException
        System.out.println(c);
        // Unchecked Exception - java.lang.ArithmeticException and NullPointerException
        String name = null;
        name.trim(); //  NUllPointer Exception
    }
}
