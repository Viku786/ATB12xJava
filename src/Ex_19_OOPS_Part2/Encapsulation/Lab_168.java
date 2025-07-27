package Ex_19_OOPS_Part2.Encapsulation;

public class Lab_168 {
    public static void main(String[] args) {

        ICICIBank vikash = new ICICIBank("Vikash",100);
        System.out.println(vikash.getBal());

        boolean isCashier = false;
        vikash.setBal(1000,isCashier);
        System.out.println(vikash.getBal());
        System.out.println(vikash.bank_name);
    }
}

class ICICIBank{

    private String name;
    private long bal;
    public String bank_name = "ICICI";

    public ICICIBank(String name, long bal) {
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

    public void setBal(long bal , boolean isCashier) {
        if(isCashier){
            this.bal = bal;
        }
        else{
            System.out.println("Not allowed to change the Balance");
        }
    }
}