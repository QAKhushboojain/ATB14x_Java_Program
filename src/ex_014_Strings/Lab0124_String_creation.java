package ex_014_Strings;

public class Lab0124_String_creation {
    public static void main(String[] args) {
        String s1 = "Khushboo"; // String constant pool
        String s2 = new String("Khushboo"); // QA object area
        System.out.println(s1);
        System.out.println(s2);
    }
}
