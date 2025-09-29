package ex_010_For_Loop;

public class Lab0101_for_loop_even_odd {
    public static void main(String[] args) {
        for (int i = 1; i <= 50 ; i++)
        {
             if(i%2 == 0 )
             {
                 continue; // Run  odd number
             }
            System.out.println(i);
        }
        /* for (int i = 1; i <= 50 ; i++)
        {
             if(i%2 != 0 ) // run even number
             {
                 continue; // for odd number
             }
            System.out.println(i);
        } */
    }
}
