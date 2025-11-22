package ex_030_Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab237AI_iteration {
    public static void main(String[] args) {
        System.out.println("To Print ArrayList - 1");
        List<String> mylist = new ArrayList<>();
        mylist.add("Khushboo");
        mylist.add("Jain");
        mylist.add("Amit");
        System.out.println("To Print ArrayList - 2");
        for(String str : mylist){
            System.out.println(str);
        }
        System.out.println("To Print ArrayList - 3");
        Iterator<String> iterator = mylist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
