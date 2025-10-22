package ex_022_access_Modifier.police;


public class Rahul extends Cop
{
    public Rahul(int bullet)
    {
        super(bullet);
    }

    public static void main(String[] args) {
        Cop p = new Cop(100);
        p.thisDefaultF1();
    }
}
