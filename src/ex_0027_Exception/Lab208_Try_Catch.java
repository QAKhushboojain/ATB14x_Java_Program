package ex_0027_Exception;

public class Lab208_Try_Catch {
    public static void main(String[] args) {
        String s1 = null;
        try {
            s1.trim();
        }
        catch (Exception e)
        {
            System.out.println("Error, Trim not allowed for the null value");
           // throw new RuntimeException(e);
        }
        // unchecked Exception
       // java.lang.NullPointerException
    }
}
