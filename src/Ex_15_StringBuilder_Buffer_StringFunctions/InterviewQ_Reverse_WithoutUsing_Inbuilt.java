package Ex_15_StringBuilder_Buffer_StringFunctions;

public class InterviewQ_Reverse_WithoutUsing_Inbuilt {
    public static void main(String[] args) {

        String input="Vikash";

        for (int i = input.length()-1;i>=0;i--){
            System.out.print(input.charAt(i));
        }
    }
}
