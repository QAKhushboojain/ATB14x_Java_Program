package ex_017_OOPS;

public class Lab0160_Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Khushboo");
    }
}
class Student
{
    String name;
    Student() // default constructor
    {
        System.out.println("Default Constructor Hi, I am called");
    }
    Student(String name)
    {
        System.out.println("Parameterized Constructor Hi"+ name);
    }
    void sleep(){}
    void study(){}
    void eat(){}

}
