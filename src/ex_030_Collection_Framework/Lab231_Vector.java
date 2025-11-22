package ex_030_Collection_Framework;

import java.util.Vector;

public class Lab231_Vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("Khushboo");
        v.add("Amit");
        v.add("Lucky");
        System.out.println(v);
        v.remove("Lucky");
        System.out.println(v);
        System.out.println(v.contains("Lucky"));
    }
}
