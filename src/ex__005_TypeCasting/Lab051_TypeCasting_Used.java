package ex__005_TypeCasting;

public class Lab051_TypeCasting_Used {
    public static void main(String[] args) {
        int val = 300;
        //byte b = val; Narrowing Implicit is not possible
        byte b = (byte) val; // Narrowing Explicit is possible
        System.out.println(b);

    }
}
