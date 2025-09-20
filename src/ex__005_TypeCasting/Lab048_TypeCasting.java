package ex__005_TypeCasting;

public class Lab048_TypeCasting {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; // valid syntax -> widening - Implicit Casting - Automatically done
        int a1 = (int) b ; // explicit -> widening - Implicit Casting -> not required

    }
}
