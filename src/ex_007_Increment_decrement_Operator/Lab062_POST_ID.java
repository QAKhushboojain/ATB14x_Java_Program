package ex_007_Increment_decrement_Operator;

public class Lab062_POST_ID {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a);
        // Post Increment
        int a_post = 10;
        int b = a_post++;
        System.out.println(a_post);
        System.out.println(b);
    }
}
