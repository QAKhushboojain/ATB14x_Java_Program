package ex_0027_Exception;

public class Lab215_Expection_Real {
    public static void main(String[] args) {
        try{
            String ip = args[0];
            int a = Integer.parseInt(ip);
            int b = 100/a;
            System.out.println(b);
        }
        catch (Exception e )
        {
            System.out.println(e.getMessage());
        }
    }
}
