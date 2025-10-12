package ex_016_Arrays;

public class Lab0158_Right_Aligned_Triangle {
    public static void main(String[] args) {
        int n = 5;
        for(int i =0; i < n; i++)
        {
            for(int j = i; j<n-1 ; j++)
            {
                System.out.print("_");
            }
            for(int k = 0; k<i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
