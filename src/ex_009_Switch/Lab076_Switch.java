package ex_009_Switch;

import java.util.Scanner;

public class Lab076_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter to day to 1 to 7");
        if(scanner.hasNextInt())
        {
            int day = scanner.nextInt();
            switch (day)
            {
                case 1 :
                    System.out.println("Mon");
                    break;
                case 2 :
                    System.out.println("Tues");
                    break;
                case 3 :
                    System.out.println("Wed");
                    break;
                case 4 :
                    System.out.println("Thu");
                    break;
                case 5 :
                    System.out.println("Fri");
                    break;
                case 6 :
                    System.out.println("Sat");
                    break;
                case 7 :
                    System.out.println("Sun");
                    break;
                default:
                    System.out.println("Enter int number from 1 to 7 only you Fool! ");

            }
        }
        else
        {
            System.out.println("Enter int you FOOL");
        }
    }
}
