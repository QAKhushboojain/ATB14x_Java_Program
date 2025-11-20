package ex_0027_Exception;

public class Lab216_Interview_Question {
    public static void main(String[] args) {
        final double pi = 3.14f;
        int a = 0;
        try {
            int x = 10/a;
        }
        catch (Exception e){
            System.out.println("Div by zero");
        }
        finally {
            System.out.println("I will be executed anyhow!!!");
        }
    }
}
