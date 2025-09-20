package ex__005_TypeCasting;

public class Lab050_TypeCasting {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
       // short s = phone_no; // Narrowing Implicit is not possible
        short s= (short) phone_no; // Narrowing Explicit is possible
        System.out.println(s);

    }
}
