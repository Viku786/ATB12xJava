package Ex_10_For_Loop;

public class Lab_094_Odd_Even_From_Top50 {
    public static void main(String[] args) {

        //To find the even number from 1 to 50
        //even i%2==0

        for (int i = 1; i <= 50 ; i++) {
            if(i%2==0){
                System.out.println("Even -> "+i);
            }
        }
    }
}
