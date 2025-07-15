package Ex_06_Ternary_Operator;

public class Lab053_Real_Age_Classification {
    public static void main(String[] args) {

        // age = 23 (Adult) , age<18 -> minor , age > 65 (Senior)

        String User_Input = args[0];
        System.out.println(User_Input);
        System.out.println(User_Input instanceof String );

        int age = Integer.parseInt(User_Input);
        System.out.println(age);

        String s = (age < 18) ? "Minor" : (age < 65) ? " Adult" : "Senior";
        System.out.println(s);


    }
}
