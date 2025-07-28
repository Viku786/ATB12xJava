package Task.Task_9thJune;

public class Qno_3 {
    public static void main(String[] args) {

       /*
       3) Rectangle Area Using Constructor
            Create a Rectangle class. Pass length and breadth via constructor,
            calculate and print area.
        */
        Rectangle r1 = new Rectangle(10,10);
        r1.display();
    }
}

class Rectangle{
    int legth,breadth;

    Rectangle(int legth,int breadth){
        this.legth=legth;
        this.breadth=breadth;
    }

    void display(){
        int Area = legth*breadth;
        System.out.println("Area of the rectangle : "+Area);
    }
}