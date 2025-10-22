package ex_022_access_Modifier.police;

public class Cop {
    public int gun;
    private String IDCard;
    public Cop(int bullet)
    {
        this.gun = bullet;
    }
   protected void CanIshoot()
    {
        System.out.println("Yes you can");
    }
    void thisDefaultF1()
    {
        System.out.println("Hi, Cop");
    }

}
