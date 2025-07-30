package Task.Task_18th_June;

public class Whileloop_Qno_2 {
    public static void main(String[] args) {

        //2️⃣ Print even numbers from 1 to 20

        System.out.println("Even number between 1 to 20 : ");

        int i =1;
        while (i<21) {
            if(i %2 ==0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
