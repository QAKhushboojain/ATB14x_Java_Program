package ex_030_Collection_Framework.CF_04_MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab247_Map_Iterate {
    public static void main(String[] args) {
        HashMap <String, String>m2 = new HashMap();
        m2.put("id", "1");
        m2.put("id", "2");
        m2.put("id2", "100");
        m2.put("id4", "null");
        m2.put("null", "102");
        System.out.println(m2);
        System.out.println(m2.size());
        for(Map.Entry<String, String> item : m2.entrySet()){
            System.out.println(item.getKey() + " ->"  + item.getValue());
        }
    }
}
