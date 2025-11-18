package ex_0024_Static;

import com.sun.security.jgss.GSSUtil;

public class Lab0190_Static_P2 {
}
class ATB{
    int phone_numner;
    String name;
    static String course_name = "ATB";
    static void markAttendance()
    {
        System.out.println("Mark Attendance");
       // System.out.println(this.phone_numner); static value can not access not static value
    }
    void display()
    {
        System.out.println(this.phone_numner+ this.name+course_name);
    }

}
