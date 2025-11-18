package ex_0023_Super_Abstraction_SuperKeyword.SuperKeyword.Abstraction;

public class Lab0188_Interface_Variable {
    public static void main(String[] args) {

 /*   }
}
interface Khushboo {
    final int a = 10;
    void display();
}
class Jain implements Khushboo{
    int aa = 10;
    @Override
    public void display() {
        System.out.println(a);
        System.out.println(this.aa);
    }
}
class Soumya implements TTA{
    public void practice()
    {

    }
}
 class Khushboo1 implements TTA {
     public void practice() {

     }

     interface TTA {
         void practice();
     }
     class Khushboo implements TTA_Mentor{

         @Override
         public void teach() {

         }
     }
     class Deepak implements TTA_Mentor{

         @Override
         public void teach() {

         }
     }
     interface TTA_Mentor{
         void teach();
     }
 }*/
        Jain j = new Jain();
        j.display();

        Soumya s = new Soumya();
        s.practice();

        Khushboo1 k1 = new Khushboo1();
        k1.practice();

        Khushboo1.Khushboo mentor1 = new Khushboo1.Khushboo();
        mentor1.teach();

        Khushboo1.Deepak mentor2 = new Khushboo1.Deepak();
        mentor2.teach();
    }
}

// INTERFACE 1
interface Khushboo {
    int a = 10;     // final static by default
    void display();
}

// CLASS IMPLEMENTING INTERFACE
class Jain implements Khushboo {
    int aa = 10;

    @Override
    public void display() {
        System.out.println(a);     // interface variable
        System.out.println(this.aa);
    }
}

// INTERFACE 2
interface TTA {
    void practice();
}

// CLASS USING INTERFACE TTA
class Soumya implements TTA {
    @Override
    public void practice() {
        System.out.println("Soumya is practicing");
    }
}

// CLASS IMPLEMENTING TTA
class Khushboo1 implements TTA {

    @Override
    public void practice() {
        System.out.println("Khushboo1 is practicing");
    }

    // INNER INTERFACE
    interface TTA_Mentor {
        void teach();
    }

    // INNER CLASS 1
    static class Khushboo implements TTA_Mentor {
        @Override
        public void teach() {
            System.out.println("Khushboo is teaching");
        }
    }

    // INNER CLASS 2
    static class Deepak implements TTA_Mentor {
        @Override
        public void teach() {
            System.out.println("Deepak is teaching");
        }
    }
}




