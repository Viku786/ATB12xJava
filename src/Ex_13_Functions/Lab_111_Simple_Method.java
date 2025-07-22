package Ex_13_Functions;

public class Lab_111_Simple_Method {
    public static void main(String[] args) {
        // No return type return void or nothing
        non_return_type();
        String a = return_type();
        System.out.println(a);
    }
    //No return type function does not return anything , only printing
    static void non_return_type(){
        System.out.println("Hi , Non-Return Type");
    }
    //Return type function return a particular data type
    static String return_type(){
        System.out.println("Hi , Return Type");
        return "Vikash";
    }

    static boolean return_boolean(){
        return true;
    }


}
