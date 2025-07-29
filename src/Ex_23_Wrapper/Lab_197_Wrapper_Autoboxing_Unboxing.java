package Ex_23_Wrapper;

public class Lab_197_Wrapper_Autoboxing_Unboxing {
    public static void main(String[] args) {

        // Primitive to Integer (Boxing)
        int primitiveInt = 42;
        Integer boxedInt = Integer.valueOf(primitiveInt); // Explicit boxing
        Integer autoBoxedInt = primitiveInt; // Autoboxing
        System.out.println("Primitive to Integer (Boxing): " + boxedInt + ", " + autoBoxedInt);

        // Integer to primitive (Unboxing)
        Integer integerObj = 100;
        int unboxedInt = integerObj.intValue(); // Explicit unboxing
        int autoUnboxedInt = integerObj; // Auto-unboxing
        System.out.println("Integer to primitive (Unboxing): " + unboxedInt + ", " + autoUnboxedInt);

        // String to Integer
        String str = "123";
        Integer parsedInt = Integer.parseInt(str);
        System.out.println("String to Integer: " + parsedInt);

        // Integer to String
        Integer intObj = 456;
        String intToStr = intObj.toString();
        String intToStr2 = String.valueOf(intObj);
        System.out.println("Integer to String: " + intToStr + ", " + intToStr2);

    }
}
