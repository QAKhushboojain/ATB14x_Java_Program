package ex_030_Collection_Framework.CF_05_Comparator_VS_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LabComparator {
    public static void main(String[] args) {
        List<Employee2> list = new ArrayList<>();
        list.add(new Employee2(3, "John",100));
        list.add(new Employee2(1, "Alice",134));
        list.add(new Employee2(2, "Bob",234));
        // Comparator for sorting by name
        Comparator<Employee2> nameComparator = (e1,e2) -> e1.name.compareTo(e2.name);
        Comparator<Employee2> idComparator = (e1,e2) -> e1.id-e2.id;
        Comparator<Employee2> salaryComparator = (e1,e2) -> e1.salary-e2.salary;
        Collections.sort(list,nameComparator);
       // Collections.sort(list.idComparator);
       // Collections.sort(list.salaryComparator);
        System.out.println(list);
   }
}
class Employee2{
    int id;
    String name;
    int salary;
    Employee2(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
