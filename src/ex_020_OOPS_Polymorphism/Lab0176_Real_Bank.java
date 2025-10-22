package ex_020_OOPS_Polymorphism;

public class Lab0176_Real_Bank {
    public static void main(String[] args) {
        ICICIBank iciciBank = new ICICIBank("khushboo", 1000);
      long bal =  iciciBank.getBal();
       // System.out.println(iciciBank.bal); // can't possible because private nature
        System.out.println(bal);
        // cashier
        ICICIBank cashier = new ICICIBank("Cash", 100);
        cashier.setBal(200, true);
        System.out.println(cashier.getBal());
    }
}
class ICICIBank{
    private  String name;
    private  long bal;
    public  ICICIBank(String name, long bal)
    {
      this.name = name;
      this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isCashier) {
        if(isCashier)
        {
            this.bal = bal;
        }
        else
        {
            System.out.println("Not Allowed!!");

        }

  }
}
