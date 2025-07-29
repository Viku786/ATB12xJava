package Ex_24_Exception;

public class Lab_216_CustomException {
    public static void main(String[] args) {
        Lab_215_Bank SBI = new Lab_215_Bank("INR", 100);
        Lab_215_Bank icici = new Lab_215_Bank("INR",123);

        Integer total_bal = SBI.add(icici);
        System.out.println(total_bal);

        Lab_215_Bank jp_chase = new Lab_215_Bank("USD",101);
        Integer total_balance_all_countries = SBI.add(jp_chase);
        System.out.println(total_balance_all_countries);

    }
}
