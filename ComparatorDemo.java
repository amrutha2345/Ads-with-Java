import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;
public class ComparatorDemo {
    public static void main(String args[])
    {

        Comparator<String> comparStringLength=Comparator.comparing(String::length);
        Queue<String> pqueue= new PriorityQueue<>(comparStringLength);
        

        pqueue.offer("Amrutha");
        pqueue.offer("Cherry");
        pqueue.offer("Swathi");


        while(! pqueue.isEmpty())
        {
            System.out.println(pqueue.poll());
        }
    }
}
