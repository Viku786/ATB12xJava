package Task.Task_24th_June;

public class For_While_Sum_1to100 {
    public static void main(String[] args) {

        /*
        7. Calculate the sum of numbers from 1 to 100
         */

        System.out.println("The sum of number from 1 to 100 using For loop: ");

        int sum = 0;
        for (int i = 1; i <=100 ; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("------Using While loop-------");

        System.out.println("The sum of number from 1 to 100 using While loop: ");

        int j = 1;
        int sum1 = 0;
        while (j <=100){
            sum1 +=j;
            j++;
        }
        System.out.println(sum1);
    }
}
