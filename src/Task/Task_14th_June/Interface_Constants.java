package Task.Task_14th_June;

class Car implements SpeedLimit {
    public static void main(String[] args) {
        /* 7. Interface Constants
        🔶 Objective:
        Demonstrate how to use constants (public static final variables) in interfaces.
        🔶 Steps: Create an interface SpeedLimit with a constant MAX_SPEED = 120.
        In a class Car, access and print the constant.
        Do not modify the constant—it should behave like a final value.
        🔶 Expected Output:
        Max Speed is: 120
         */

        System.out.println("Max Speed is: "+MAX_SPEED);

    }
}

interface SpeedLimit{
    int MAX_SPEED = 120; //public static final by default
}