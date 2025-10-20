package ex_018_OOPS_Constructors;

public class Lab0164_OOPS_Constructors {
    public static void main(String[] args) {
        Baby b1 = new Baby();
        new Baby();
        new Baby();
        Baby b2;
    }
}
class Baby{
    String name;
    Baby()
    {
        System.out.println("I am called, Object is created");
    }

}
