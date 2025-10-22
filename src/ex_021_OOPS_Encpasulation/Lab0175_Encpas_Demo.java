package ex_021_OOPS_Encpasulation;

public class Lab0175_Encpas_Demo {
    public static void main(String[] args) {
        VWOLogin login = new VWOLogin("admin", "pass123");
        System.out.println(login.password);
        login.password = "345";
        System.out.println(login.password);
        GoodVWOLogin goodVWOLogin = new GoodVWOLogin("admin", "pass123");
        //System.out.println(goodVWOLogin.password);
        String pass = goodVWOLogin.getPassword();
        System.out.println(pass);
        goodVWOLogin.setPassword("Khushboochild@123", false);

    }
}
class VWOLogin{
    public String username;
    public String password;
    public  VWOLogin(String username, String password)
    {
        this.password = password;
        this.username = username;
    }


}
class GoodVWOLogin{
    // Instance variables | Data variable |Attribute |Fields | Properties | Members variable
     private String username;
     private  String password;
     GoodVWOLogin(String username, String password)
     {
         this.password = password;
         this.username = username;
     }

public String getUsername() {
    return username;
}

public void setUsername(String username) {
    this.username = username;
}

public String getPassword() {
    return password;
}

    public void setPassword(String password, boolean isGoodAuntyAdmin) {
         if(isGoodAuntyAdmin)
         {
             this.password = password;
         }
         else
         {
             System.out.println("Not Allowed");
         }

    }
}
