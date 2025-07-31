package Ex_27_Collection_Framework.List;

import java.util.Stack;

public class Lab_237_Stack {
    public static void main(String[] args) {

        /*
        Stack  -> Last In First Out
         */

//        Stack s = new Stack<>();
//        s.add("Vikash");
//        s.add("Vicky");
//        s.add("Vinay");

        Stack s = new Stack<>();
        s.push("Vikash");
        s.push("Vicky");
        s.push("Vikash");
        s.push("Vinay");
        System.out.println(s);

        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.empty());
        System.out.println(s.add("Rashi"));
        System.out.println(s);
        System.out.println(s.get(0));
    }
}
