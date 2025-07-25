package Ex_16_Arrays;

public class Lab_138_Arrays_Max_Min {
    public static void main(String[] args) {

        int[] num = {54,67,78,56,89,34,11,98};
        int max_num = num[0];
        int min_num = num[0];

        for(int i = 0; i <num.length;i++){
            if(num[i]>max_num){
                max_num=num[i];
            }
        }
        System.out.println("Maximum number is -> " +max_num);

        for(int i = 0; i <num.length;i++){
            if(num[i]<min_num){
                min_num=num[i];
            }
        }
        System.out.println("Minimum number is -> " +min_num);
    }
}
