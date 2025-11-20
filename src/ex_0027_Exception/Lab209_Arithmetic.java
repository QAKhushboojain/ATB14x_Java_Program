package ex_0027_Exception;

public class Lab209_Arithmetic {
    public static void main(String[] args) {
        int c = 0;
        int b = 0;
        try {
            b = 10/c;
        } catch (ArithmeticException e) {
          //  throw new RuntimeException(e);
            System.out.println("Not Allowed");
        }
        catch (Exception e) {
            //  throw new RuntimeException(e);
            System.out.println("Hello");
        }
        catch (Throwable e) {
            //  throw new RuntimeException(e);
            System.out.println("Not Allowed");
        }
    }
}
