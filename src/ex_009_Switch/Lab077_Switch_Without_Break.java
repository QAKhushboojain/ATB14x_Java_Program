package ex_009_Switch;

import java.util.Scanner;

public class Lab077_Switch_Without_Break {
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
                case 3 :
                    System.out.println("Wed");
                case 4 :
                    System.out.println("Thu");
                case 5 :
                    System.out.println("Fri");
                case 6 :
                    System.out.println("Sat");
                case 7 :
                    System.out.println("Sun");
                default:
                    System.out.println("Invalid , day number ");
            }
        }

    }
}

