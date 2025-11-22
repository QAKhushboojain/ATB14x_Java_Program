package ex_030_Collection_Framework.CF_01_LIST;

import java.util.Stack;

public class lab239_Stack {
    public static void main(String[] args) {
        Stack s = new Stack();
        // List in first out
        s.add("Khushboo");
        s.add("Jain");
        s.add("Amit");
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop()); // Remove the element from the top
        System.out.println(s);
        System.out.println(s.add("snehal"));
        System.out.println(s);
        s.add("chetan");
        s.add("chetan");
        s.push("vijay");
        System.out.println(s);
        System.out.println(s.get(0));
        System.out.println(s.get(1));
    }
}
