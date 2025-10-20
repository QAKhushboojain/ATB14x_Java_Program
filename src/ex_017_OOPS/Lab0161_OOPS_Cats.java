package ex_017_OOPS;

public class Lab0161_OOPS_Cats {
    public static void main(String[] args) {
        Cat c1;
        Cat c2;
        Cat c23 = new Cat();
        Cat c24 = new Cat("Lucy");
        Cat c25 = new Cat("Spicy");
        Cat c26 = new Cat("Mirchi");
        new Cat();
        System.out.println(c23.name);
        System.out.println(c24.name);
        System.out.println(c25.name);
        c24.running();
        c25.running();
        c26.running();
    }
}
class Cat
{
    String name; // Instance Variable
    Cat()
    {
         name = "Kitty";
    }
    Cat(String nameParam)
    {
       this.name = nameParam;
     //   c24.name = "Lucy";
       // c25.name = "Spice";
    }
    void running()
    {
        int i = 10; // local variable
        System.out.println("Who is running"+this.name);
    }
}
