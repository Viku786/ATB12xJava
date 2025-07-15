package Ex_06_Ternary_Operator;

public class Lab051_TO_Even_Odd {
    public static void main(String[] args) {

        //Step 1- Input , Output -> Data Type
        int num=-13;
        //Input = Int
       // Output = string -> Even or Odd

        //Step 2 -> num % 2 ==0 -> Even else odd in 1

        String result = num % 2 == 0 ? "Even" : "Odd";
        System.out.println(result);

        //Edge cases
        // negative, float , 0



    }
}
