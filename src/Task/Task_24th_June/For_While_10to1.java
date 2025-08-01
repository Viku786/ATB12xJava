package Task.Task_24th_June;

public class For_While_10to1 {
    public static void main(String[] args) {

        /*
        6. Print Numbers from 10 to 1 (Reverse Order)
         */
        System.out.println("Reverse number from 10 to 1 :");
        for (int i = 10; i >0 ; i--) {
            System.out.print( " " +i );
        }

        System.out.println(" ");
        System.out.println("------Using While loop-------");

        System.out.println("Reverse number from 10 to 1 :");
        int j=10;
        while (j >0){
            System.out.print(" " +j);
            j--;
        }
    }
}
