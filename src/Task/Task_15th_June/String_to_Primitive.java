package Task.Task_15th_June;

public class String_to_Primitive {
    public static void main(String[] args) {
        /* 3. Converting String to Primitive Using Wrapper
        Description: Uses wrapper class methods to parse a numeric string into
        a primitive int.
         */
        String str = "123";
        int num = Integer.parseInt(str); //String -> Int
        System.out.println("Converted to int: "+num);

        String decimal = "23.57";
        double d1 = Double.parseDouble(decimal);
        System.out.println("Converted Double: "+d1);
    }
}
