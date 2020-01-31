package Queue;

//The Queue interface extends the Collection interface
//It is used to hold the elements about to be processed
//and provides various operations like the insertion, removal etc.
//It is an ordered list of objects.
//Inserting elements at the end of the list.
//Deleting elements at the start of the list.(FIFO - first ind, first out)
//Supports all methods of collection interface.

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i<10; i++){
            queue.add(i);
        }

        System.out.println("Elementer ind queue: " + queue);

        System.out.println("Remove element" + queue.remove());
        System.out.println(queue);

        //Looking at the first element in queue
        System.out.println(queue.peek());
        System.out.println(queue);

        //Returns the object and deletes it
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
