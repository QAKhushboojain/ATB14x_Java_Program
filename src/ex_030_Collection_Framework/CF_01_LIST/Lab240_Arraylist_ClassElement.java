package ex_030_Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab240_Arraylist_ClassElement {
    public static void main(String[] args) {
        Student s1 = new Student("Amit", "1");
        Student s2 = new Student("Ritwik", "2");
        Student s3 = new Student("Shubham", "3");
        List <Student> myStudent = new ArrayList();
        myStudent.add(s1);
        myStudent.add(s2);
        myStudent.add(s3);
        s1.printDetails();
        s2.printDetails();
        s3.printDetails();

    }
}
class Student extends Object{
    private String name;
    private String rolNo;

    public Student(String name, String rolNo) {
        this.name = name;
        this.rolNo = rolNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRolNo() {
        return rolNo;
    }

    public void setRolNo(String rolNo) {
        this.rolNo = rolNo;
    }


        public  void printDetails(){
            System.out.println("Student Name"+ this.name);
            System.out.println("RollNO" + rolNo);
        }
}
