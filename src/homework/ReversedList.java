package homework;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ReversedList {
    public static void getReversedList(){
        Queue<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        while (!list.isEmpty()) {
            System.out.println(((LinkedList<Integer>) list).removeLast());
        }
    }
}
