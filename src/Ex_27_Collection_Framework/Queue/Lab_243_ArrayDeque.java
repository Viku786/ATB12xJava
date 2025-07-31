package Ex_27_Collection_Framework.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Lab_243_ArrayDeque {
    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();
        dq.push(5);
        dq.push(1);
        System.out.println(dq);

    }
}
