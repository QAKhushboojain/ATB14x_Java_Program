package ex_030_Collection_Framework.CF_04_MAP;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Lab_Map_Real {
    public static void main(String[] args) {
        Map<String, Object> student = new HashMap<>();
        student.put("Name", "Diwakar");
        student.put("PhoneNo", "1212122345");
        student.put("Address", "BLR");
        student.put("Home_address", "SilkBoard");
        System.out.println(student);
        // Linked HashMap
        Map<String, Object> student1 = new LinkedHashMap<>();
        student1.put("Name", "Diksha");
        student1.put("PhoneNo", "1212122345");
        student1.put("Address", "DEl");
        student1.put("Home_address", "RG");
        System.out.println(student);

        Set book_read_items = new HashSet();
        book_read_items.add("Rich dad and poor dad");
        book_read_items.add("Sapanies");
        book_read_items.add("Secret");
        book_read_items.add("Atomic Habbit");
        book_read_items.add("Atomic Habbit");
        book_read_items.add("Eat the Frog");



    }
}
