package ex_010_For_Loop;

public class Lab0100_for_loop_continue {
    public static void main(String[] args) {
        for (int i = 0; i < 50 ; i++)
        {
            if(i == 5)
            {
                continue; // go to above not execute bolow code only 5 is not execute
            }
            System.out.println(i); // 0 1 2 3  4 5 is skip
        }
    }
}
