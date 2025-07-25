package Ex_16_Arrays;

public class Lab_144_InterviewQ_Second_highest2 {
    public static void main(String[] args) {

        int[] number = {12,34,56,76,54,65,87,88,87,88};
       // int highest = 0;
        //int secondhighest = 0;

        int highest = Integer.MIN_VALUE;
        // It's solve the edge cases when user enter -ve number between them.
        int secondHighest = Integer.MIN_VALUE;

        for (int num : number){
            if(num > highest){
                secondHighest = highest;
                highest=num;
            } else if (num > secondHighest && num!=highest) {
                secondHighest = num;
            }
        }

        System.out.println(secondHighest);
    }
}
