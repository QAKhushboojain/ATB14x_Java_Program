package ex_009_Switch;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab079_Real_Switch_Automation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Browser");
        String browser = scanner.next();
        switch (browser) {
            case "Chrome":
                System.out.println("Starting the Chrome");
                System.out.println("............");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "FireFox":
                System.out.println("Starting the FireFox Browser");
                break;
            case "edge":
                System.out.println("Execute the edge code");
                break;
            default:
                System.out.println("I have no idea which browser is");
                break;
        }
    }
}
