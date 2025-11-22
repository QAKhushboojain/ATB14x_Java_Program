package ex_030_Collection_Framework.CF_02_SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab_SET {
    public static void main(String[] args) {
        Set hs = new HashSet(); // hash table mechanism to store the data
        hs.add("Khushboo");
        hs.add("Jkhushboo");
        System.out.println(hs);
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();
    }
}
