package ex_0027_Exception;

public class Lab214_JrQA {
    public static void main(String[] args) {
        String ip = null;
        try {
            ip = args[0];
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        int a = 0;
        try
        {
            a = Integer.parseInt(ip);
        } catch (NumberFormatException e)
        {
            System.out.println(e.getMessage());
        }
        int b = 0;
        try {
            b = 100/a;
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
    }
}
