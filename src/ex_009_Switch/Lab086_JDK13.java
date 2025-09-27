package ex_009_Switch;

public class Lab086_JDK13 {
    public static void main(String[] args) {
        int itemcode = 006;
        switch (itemcode)
        {
            case 001, 002, 005:
                System.out.println("All of them are Electronic Gadget");
                break;
            case 004,006,007:
                System.out.println("This is Match");
                break;
            default:
                System.out.println("None");
        }
    }
}
