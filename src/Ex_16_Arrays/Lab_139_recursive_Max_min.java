package Ex_16_Arrays;

public class Lab_139_recursive_Max_min {
    public static void main(String[] args) {

        int[] num = {54,67,78,56,89,34,11,98};
        int max_number = give_max_number(num);
        System.out.println("Maximum number is -> "+max_number);

        int min_number = give_min_number(num);
        System.out.println("Mininum number is -> "+min_number);
    }

    static int give_max_number (int [] num) {
        int max = num[0];

        for(int i = 0; i <num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        return max;
    }

    static int give_min_number (int [] num) {
        int min = num[0];

        for(int i = 0; i <num.length;i++){
            if(num[i]<min){
                min=num[i];
            }
        }
        return min;
    }

}
