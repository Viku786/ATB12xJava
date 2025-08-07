package Live_Test.String_Assisment.Java_OOPs_and_Exception_Handling;

public class Qno_13 {
    public static void main(String[] args) {

        /* Create a class "Outer" with an inner class "Inner".
        Access the inner class from the outer class and demonstrate their interaction.
         */

        Outer outer = new Outer();
        outer.outerDisplay();

        Outer.Inner inner = outer.new Inner();
        inner.innerDisplay();


    }
}

class Outer{
    int x = 10;
    class Inner{
        public void innerDisplay(){
            System.out.println("Inner class accessing outer variable: "+x);
        }
    }

    public void outerDisplay(){
        System.out.println("Outer class variable x: "+x);
    }
}