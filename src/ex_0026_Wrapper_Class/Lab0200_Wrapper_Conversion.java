package ex_0026_Wrapper_Class;

public class Lab0200_Wrapper_Conversion {
    public static void main(String[] args) {
        int a = 10;
     //   a. // no attribute
     //    a.len() // no method
        // because this is primitive data type
        Integer a1 = 10;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.valueOf(a1));
        System.out.println(a1.intValue());
    }
}
