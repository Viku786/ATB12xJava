package Task.Task_18th_June;

public class Whileloop_Qno_4 {
    public static void main(String[] args) {

        // 4️⃣ Calculate sum of first 10 natural numbers

        System.out.print("Sum of first 10 natural number: ");

        int sum = 0;
        int i =1;
        while (i < 11) {
            sum = sum+i;
            i++;
        }
        System.out.print(sum);
    }
}
