package ex_030_Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Lab235_ArrayList_Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List list = new ArrayList();
        String continueInput = "Y";
        List<String> names = new ArrayList<>();
        while (continueInput.equalsIgnoreCase("Y")){
            System.out.println("Enter the name");
            String name = scanner.next();
            names.add(name);
            scanner.nextLine();
            System.out.println("Do you want to another name");
            continueInput = scanner.nextLine();
        }
        for(String name : names){
            System.out.println(name);
        }
        scanner.close();
    }
}
