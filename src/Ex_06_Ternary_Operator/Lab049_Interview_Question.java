package Ex_06_Ternary_Operator;

public class Lab049_Interview_Question {
    public static void main(String[] args) {

        //Nested Ternary
        //result = condition ? Expression1 : (condition2 ?expression2 : expression3);

        int num=17;
        String result = (num > 18) ? ((num > 25) ? "You can Drink" : "You Can't Drink") : "You Can't go to goa";
        System.out.println(result);

    }
}
