package ex_030_Collection_Framework.CF_02_SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab241_Set_HS_LHS_TS {
    public static void main(String[] args) {
        Set <String> hs = new HashSet();
        // Hashing mechanism to store the element, no order
        // no duplicates
        hs.add("apple");
        hs.add("orange");
        hs.add("watermalon");
        hs.add("watermalon");
        //hs.add(123);
        hs.add("null");
        System.out.println(hs);
        System.out.println("-------------");
        Set linkedHashSet = new LinkedHashSet();
        // linked list mechanism to store the element
        // order will maintain , no duplicates
        linkedHashSet.add("dapple");
        linkedHashSet.add("apple");
        linkedHashSet.add("orange");
        linkedHashSet.add("watermalon");
        linkedHashSet.add("watermalon");
        linkedHashSet.add("null");
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.isEmpty());
        System.out.println(linkedHashSet.contains("apple"));
        System.out.println(linkedHashSet.size());
        System.out.println("----------");
        // Tree Set
        Set treeSet = new TreeSet();
        // Black and Red tree mechanism to store the element
        // order will maintain, Natural sorting is done
      treeSet.add("Dapple");
      treeSet.add("apple");
      treeSet.add("orange");
      treeSet.add("watermalon");
    //  treeSet.add(123);
     // treeSet.add(null);
        System.out.println(treeSet);

    }
}
