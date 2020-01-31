import java.util.LinkedList;

public class Queue {

    public static void main(String[] args) {

        java.util.Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i<10; i++){
            queue.add(i);
        }

        System.out.println("Elementer ind queue: " + queue);

        System.out.println("Remove element: " + queue.remove());
        System.out.println(queue);

        //Looking at the first element in queue
        System.out.println("Looking at next element in queue: " + queue.peek());
        System.out.println(queue);

        //Returns the object and deletes it
        System.out.println("Looking at element and removes it: " + queue.poll());
        System.out.println(queue);
    }
}
