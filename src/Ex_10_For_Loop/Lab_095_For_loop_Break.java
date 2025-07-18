package Ex_10_For_Loop;

public class Lab_095_For_loop_Break {
    public static void main(String[] args) {

        for (int i=0 ;i<10 ;i++){ //0 t0 10 ->11 times
           // System.out.println(i); // output - 0,1,2,3,4,5
            if (i == 5) {
               // System.out.println(i); //5
                break;
               // System.out.println(i); unreachable statement
            }
           System.out.println(i); // output - 0,1,2,3,4
        }
    }
}
