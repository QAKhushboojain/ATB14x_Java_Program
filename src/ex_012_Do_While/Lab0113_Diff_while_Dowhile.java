package ex_012_Do_While;

public class Lab0113_Diff_while_Dowhile {
    public static void main(String[] args) {
        int a = 0;
       /* while (a < 0)
        {
            System.out.println(a);
            a++;
        } */
        do
        {
            System.out.println(a);
            a++;
        }
        while (a < 0);
    }
}
