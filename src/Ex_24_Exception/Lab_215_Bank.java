package Ex_24_Exception;

public class Lab_215_Bank {

    private String currency;
    private Integer Amount;

    public Lab_215_Bank(String currency, Integer amount) {
        this.currency = currency;
        this.Amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer amount) {
        Amount = amount;
    }

    public Integer add(Lab_215_Bank bankName) {
        if (bankName.currency.equalsIgnoreCase("INR")) {
            return bankName.Amount + this.Amount;
        } else {
            try {
                throw new customException("Currency Mismatch! Can't Proceed");
            } catch (customException e) {
                throw new RuntimeException(e);
            }

        }
    }


}

class customException extends Exception{
    customException(String msg){
        super(msg);
    }
}