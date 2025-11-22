package ex_030_Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab228_List {
    public static void main(String[] args) {
        List fruits = List.of("orange","apple", "guava","mango","watermalon");
        System.out.println(fruits);
        List ArrayList = new ArrayList();
        ArrayList.add("Khushboo");
        ArrayList.add("Khushboo");
        ArrayList.add("Jain");
        ArrayList.add(true);
        ArrayList.add(123);
        ArrayList.add(1.23);
        System.out.println(ArrayList);
        System.out.println(ArrayList.size());
    }
}
