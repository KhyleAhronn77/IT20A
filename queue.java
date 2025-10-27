
package midterm;
import java.util.LinkedList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;



public class queue {
    public static void main(String[]args){
        Queue<String> arrivalOrder = new LinkedList<>();
        
        arrivalOrder.add("Anna (Severity: 3)");
        arrivalOrder.add("Bob (Severity: 1)");
        arrivalOrder.add("Carla (Severity: 2)");
        arrivalOrder.add("Dave (Severity: 1)");
        
        
        
        System.out.println("=== Arrival Order ===");
        System.out.println("Arrival Order: " + arrivalOrder);
        System.out.println();
        
        PriorityQueue<String> names = new PriorityQueue<>();
        names.add("Bob (Severity: 1)");
        names.add("Dave (Severity: 1)");
        names.add("Carla (Severity: 2)");
        names.add("Anna (Severity: 3)");

        System.out.println("=== Treatment Order ===");
        while (!names.isEmpty()) {
            System.out.println("Treating: " + names.poll());
        }
    }
}


        
        
        
    
    

