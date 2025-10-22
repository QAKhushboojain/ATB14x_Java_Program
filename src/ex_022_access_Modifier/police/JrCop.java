package ex_022_access_Modifier.police;

public class JrCop {
    public static void main(String[] args) {
        Cop jrCop = new Cop(5);
        jrCop.CanIshoot();
        // Private means with in the class
        // public means everywhere
        // protected means with in the package/Folder
        // default means in
    }
}
