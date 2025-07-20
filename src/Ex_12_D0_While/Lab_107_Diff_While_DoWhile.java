package Ex_12_D0_While;

public class Lab_107_Diff_While_DoWhile {
    public static void main(String[] args) {

        int a = 0;
        while(a < 0){
            System.out.println(a);
            a++;
        }

        System.out.println("------------");

        int b = 0;
        do{
            System.out.println(b);
            b++;
        }while (b<0);
    }
}
