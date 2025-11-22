package ex_030_Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab236_Linked_List {
    public static void main(String[] args) {
        List mylist = new ArrayList();
        List mylist1 = new ArrayList(10);
        List mylist2 = List.of("12", "23");
        List mylist3 = new LinkedList();
        mylist3.add(1);
        mylist3.add(2);
        mylist3.add(3);
        mylist3.add(4);
        mylist3.add(4);
        System.out.println(mylist3);
    }
}


