package ex_020_OOPS_Polymorphism;

public class Lab0172_Real_MethodOverloading {
    public static void main(String[] args) {
        Home h1 = new Home();
        h1.task();
        h1.task("Bathroom");
    }
}
class Home{
    void task()
    {
        System.out.println("Task Cleaning Fan");
    }
    void task(String WhichTask)
    {
        System.out.println("Task"+ WhichTask);
    }
}
