package ex_003_Literals;

public class Lab024_Character_Literals {
    public static void main(String[] args) {
        char C1 = 'A'; // A-z, a-z, !@#$%^&*()
        // char = "A";  "" == string a bunch of character
        char C2 = 'B';
        char C3 = '@';
        char C4 =  '_';
        char C5 =  '9';
        char C6 = '1';
        char C7 =  '(';
        char C8 =  ' '; // blank space
        // Escape sequence
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';
        System.out.println("Khushboo Jain");
        System.out.println("Khushboo"+new_line+"Jain");
        System.out.println("Khushboo\nJain");
        System.out.println("Khushboo"+tab_line+"Jain");
        System.out.println("Khushboo"+back_space+"Jain");
        System.out.println("--------");
        // back space delete 1 character
        System.out.println("Hi, This is First line"+new_line+"This is Second line/n This is Third line");

        char C10 = 'A';
        // ASCII , (Limited Numbers) - A to 65
        char rupees = '₹';
        System.out.println(rupees);
        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);
        char C11 = '\u1F60';
    }
}
