package ex__005_TypeCasting;

public class Lab047Type_Casting {
    public static void main(String[] args) {
        byte b = 10;
       // int a = b; // valid syntax - Implicit - widening
        int a = (int) b; // Explicit - widening
        int a1 = 300;
      //  byte b1= a1;  Not possible


    }
}
