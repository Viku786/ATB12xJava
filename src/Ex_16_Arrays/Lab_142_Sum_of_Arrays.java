package Ex_16_Arrays;

public class Lab_142_Sum_of_Arrays {
    public static void main(String[] args) {

        int[] number = {45,55,65,75,85,95};
        int sum = 0;
        int sum1 = 0;

        for(int i = number.length-1;i>=0;i--){
            sum = sum+number[i];
        }
        System.out.println(sum);

        for (int j=0;j< number.length;j++){
            sum1 = sum1+number[j];
        }
        System.out.println("Second logic sum -> "+sum1);
    }
}
