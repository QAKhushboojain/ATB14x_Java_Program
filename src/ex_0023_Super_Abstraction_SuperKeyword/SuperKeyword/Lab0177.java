package ex_0023_Super_Abstraction_SuperKeyword.SuperKeyword;

public class Lab0177 {
}
class BaseClass{
    BaseClass()
    {
        System.out.println("Default Constructor of Parent ");
    }
    BaseClass(String browser)
    {
        this.browser = browser;
        System.out.println("Default Constructor - Parent");
    }
    private String  browser;
    public String getBrowser() {
        return browser;
    }
    public void setBrowser(String browser) {
        this.browser = browser;
    }

    void openBrowser(){
        System.out.println("opening Browser!!!");
    }
    void openBrowser(String browserName)
    {
        System.out.println("open Browser" + browserName);
    }
    void closeBrowser()
    {
        System.out.println("Close Browser");
    }

}
class TestCase extends BaseClass{
    void testC(){}
    TestCase(){
        // super(); - Default Constructor
        super("Chrome"); // parameterized constructor
        super.openBrowser(); // Normal Type 1 Function
        super.openBrowser("Chrome");
        super.closeBrowser();
        System.out.println(super.getBrowser()); // Getter method
        super.setBrowser("Firefox"); // setter method

    }

}
