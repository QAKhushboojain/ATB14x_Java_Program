package ex_020_OOPS_Polymorphism;

public class Lab0174_Real_MethodOverriding {
    public static void main(String[] args) {
        ChromeTC c1 = new ChromeTC();
        c1.openBrowser();
        Firefox f1 = new Firefox();
        f1.openBrowser();
        CommonToAll common = new CommonToAll();
        common.openBrowser();
        // Dynamic Dispatch
        CommonToAll common1 = new ChromeTC();
        common1.openBrowser();
        CommonToAll common2 = new Firefox();
        common2.openBrowser();
    }
}
class CommonToAll{
    void openBrowser()
    {
        System.out.println("Starting the IE browser");
    }
}
class ChromeTC extends CommonToAll{
    void openBrowser()
    {
        System.out.println("Starting Chrome, Better Browser");
    }
}
class Firefox extends CommonToAll{
    void openBrowser()
    {
        System.out.println("Starting Firefox, Better Browser");
    }
}