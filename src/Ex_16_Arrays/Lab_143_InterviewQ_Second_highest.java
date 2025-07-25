package Ex_16_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.TreeSet;

public class Lab_143_InterviewQ_Second_highest {
    public static void main(String[] args) {

        int[] number = {12,34,56,76,54,65,87,88,87,88};
        Arrays.sort(number);
        System.out.println(number[number.length-3]);


        System.out.println("----------------------");

        //TreeSet -> Automatically sorts + removes duplicates
        TreeSet<Integer> sortedSet = new TreeSet<>();

        for (int num : number) {
            sortedSet.add(num);
        }

        // Remove the highest value
        if (sortedSet.size() < 2) {
            System.out.println("Not enough unique numbers to find second highest.");
        } else {
            sortedSet.pollLast();  // Remove highest
            int secondHighest = sortedSet.last();  // Now last is second highest
            System.out.println("Second highest unique number: " + secondHighest);
        }
    }
}
