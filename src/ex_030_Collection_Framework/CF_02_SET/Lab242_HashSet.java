package ex_030_Collection_Framework.CF_02_SET;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Set;

public class Lab242_HashSet {
    public static void main(String[] args) {
        Set <Integer> set = new TreeSet<>();
        set.add(9);
        set.add(3);
        set.add(1);
        System.out.println("Set Elements"+ set);
        Iterator iterator = set.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
