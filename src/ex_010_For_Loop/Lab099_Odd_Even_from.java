package ex_010_For_Loop;

public class Lab099_Odd_Even_from {
    public static void main(String[] args) {
        // To find even numbers from 1 to 50
        for (int i = 1; i <= 50; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println("Even" +i);
            }
          /*  for (int i = 1; i <= 50; i++)
            {
                if(i % 2 != 0)
                {
                    System.out.println("Odd" +i);
                } */
        }
    }
}
