package ex_0027_Exception;

public class Lab222_Finalize {
    public static void main(String[] args) {
        Lab222_Finalize lab222Finalize = new Lab222_Finalize();
        lab222Finalize = null;
        System.gc();
        System.out.println("Main  Method Done");
    }
    public void finalize(){
        //System.out.println("Hi, called");
        System.out.println("Finalize method called before GC");

}


}
