package ex_010_For_Loop;

public class Lab0100_for_loop_break {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) // 0 to 49 , 50 times run
        {
          //  System.out.println(i);
            if(i == 5)
            {
                break;
            }
            System.out.println(i);  // 0 to 4 print
        }
    }
}
