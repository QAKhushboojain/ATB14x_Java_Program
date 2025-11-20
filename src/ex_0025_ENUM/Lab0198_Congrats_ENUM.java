package ex_0025_ENUM;

public class Lab0198_Congrats_ENUM {
    public static void main(String[] args) {
      //  System.out.println(Environment.PROD.getBaseURL());
       // System.out.println(Environment.DEV.getBaseURL());
        System.out.println(Env.PROD.getBaseURL());
        System.out.println(Env.DEV.getBaseURL());
    }
}
enum Environment{
    DEV("https://dev.myapp.com/"),
    STAGING("https://staging.myapp.com/"),
    PROD("https://myapp.com/");
    private final String baseURL;
   Environment (String baseURL)
   {
       this.baseURL = baseURL;
   }
   public String getBaseURL(){
       return baseURL;
    }
}
