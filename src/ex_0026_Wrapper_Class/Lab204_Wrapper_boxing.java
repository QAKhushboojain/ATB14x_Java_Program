package ex_0026_Wrapper_Class;

public class Lab204_Wrapper_boxing {
    public static void main(String[] args) {
        int a = 10;
        Integer a11 = 10;
        // Boxing - primtive - wrapper - AutoBoxing - JVM will do it.
        System.out.println(a11.intValue());
        System.out.println(a);
        // Unboxing Reverse (Wrapper to primitive)
        Integer aa = 43;
        Integer a1 = aa; // Unboxing
        System.out.println(a1);
    }
}
