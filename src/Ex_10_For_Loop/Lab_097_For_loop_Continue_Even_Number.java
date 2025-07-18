package Ex_10_For_Loop;

public class Lab_097_For_loop_Continue_Even_Number {
    public static void main(String[] args) {

        for (int i=0 ;i<=20 ;i++){
            if (i % 2== 0) {
                System.out.println(i);
                continue;
            }
            else {
                System.out.println("Odd No. -> " +i);
            }
        }
        System.out.println("------------------------");
        for (int j=0 ;j<=20 ;j++){
            if (j % 2== 0) {
                //System.out.println(i);
                continue;
            }
                System.out.println("Odd No. -> " +j);

        }
    }
}
