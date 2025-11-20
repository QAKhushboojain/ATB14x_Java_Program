package ex_0027_Exception;

public class Lab220_CustomException {
    public static void main(String[] args) throws Exception {
        Bank sbi = new Bank("INR", 100);
        Bank icici = new Bank("INR", 123);

        Integer total_balance = sbi.add(icici);
        System.out.println(total_balance);
        Bank jp_chase = new Bank("USD", 101);
        Integer total_balance_all_countries = sbi.add(jp_chase);
        System.out.println(total_balance_all_countries);
    }
}

class Bank {

    private String currency;
    private Integer amount;

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(Bank bankName) throws Exception {
        if(!bankName.currency.equalsIgnoreCase("INR"))
        {
          throw  new CustomException("Currency Mismatch , we can not proceed");
        }
        return this.amount + bankName.amount;
    }
}
class CustomException extends Exception{
    CustomException(String MSG){
        super(MSG);
    }
}

