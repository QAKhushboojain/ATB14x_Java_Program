package ex_0024_Static;

public class Lab0192_Real_Static {
}
class ATB14x{
    {
        System.out.println("IIB - this is called when object is created");
    }
    static {
        System.out.println("Load the class? I will execute");
    }
    private  String name ;
    private String phone;
    static String course_name = "ATBx14";

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    void readDocuments()
    {
        System.out.println("Non Static Method");
        System.out.println(course_name);
    }
    static void doAssignemnt()
    {
      //  System.out.println(phone); // static method can not access non static
        System.out.println("Do Assignment");

    }


}
