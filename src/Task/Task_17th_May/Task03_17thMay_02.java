package Task.Task_17th_May;

public class Task03_17thMay_02 {
    public static void main(String[] args) {

        //Use the ternary operator, nested ternary operator.
        // If we have three numbers, N1, N2, and N3, give me the maximum between the three numbers.

        int a=10 , b=27, c=25;

        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        System.out.println("Maximum no. is " +max);
    }
}
