package ex_0025_ENUM;

public class Lab0196_ENUM_P3 {
    public static void main(String[] args) {
        System.out.println(HEX_COLOURS.RED.getHexcode());
    }
}
enum HEX_COLOURS{
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");
    private String hexcode;
    HEX_COLOURS(String hexcode)
    {
        this.hexcode = hexcode;
    }
    String getHexcode()
    {
        return this.hexcode;

    }
}

