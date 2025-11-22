package ex_030_Collection_Framework.CF_04_MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab244_MAP_P1 {
    public static void main(String[] args) {
        /*Map m1 = new HashMap();
        m1.put("Name","Khushboo");
        m1.put("RollNo","123");
        m1.put("true","Jain");
        m1.put("3.14", "Jain");  */
    Map m1 = new HashMap();
    m1.put("Name", "Khushboo");
    m1.put("RollNo", 1);
    m1.put("PhoneNumber", "1122323234");
        System.out.println(m1);

        // Linked Hash Map
        Map m2 = new LinkedHashMap();
        m1.put("Name", "Khushboo");
        m1.put("RollNo", 1);
        m1.put("PhoneNumber", "1122323234");
        System.out.println(m2);

        // Tree Map
        Map m3= new TreeMap();
        m1.put("Name", "Khushboo");
        m1.put("RollNo", 1);
        m1.put("PhoneNumber", "1122323234");
        System.out.println(m3);


    }
}
