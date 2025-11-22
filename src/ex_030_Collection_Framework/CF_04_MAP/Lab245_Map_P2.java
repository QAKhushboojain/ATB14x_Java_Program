package ex_030_Collection_Framework.CF_04_MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab245_Map_P2 {
    public static void main(String[] args) {
       // Map m1 = new HashMap();
        HashMap m2 = new HashMap();
        m2.put("id", "1");
        m2.put("id", "2");
        m2.put("id2", "100");
        m2.put("id4", "null");
        m2.put("null", "102");
        System.out.println(m2);
        System.out.println(m2.size());
        System.out.println(m2.isEmpty());
        System.out.println(m2.containsKey("id2"));
        System.out.println(m2.containsValue(99));
        System.out.println(m2.keySet());
        System.out.println(m2.values());
        System.out.println(m2.get("id2"));

    }
}
