package Ex_27_Collection_Framework.Queue;

import java.util.PriorityQueue;

public class Lab_242_Queue {
    public static void main(String[] args) {

        //0.001 used in Automation

        PriorityQueue pq = new PriorityQueue<>();
        pq.add("Vikash");
        pq.add("Singh");
        System.out.println(pq); //Natural Sorting

        System.out.println(pq.peek());
        System.out.println(pq.poll());//Remove the element
        System.out.println(pq);
    }
}
