package midterm;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Patient {
    String name;
    int severity;
    int arrivalOrder;

    public Patient(String name, int severity, int arrivalOrder) {
        this.name = name;
        this.severity = severity;
        this.arrivalOrder = arrivalOrder;
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

public class queue {
    public static void main(String[] args) {
        // Arrival order queue
        Queue<Patient> arrivalOrder = new LinkedList<>();
        arrivalOrder.add(new Patient("Anna", 3, 0));
        arrivalOrder.add(new Patient("Bob", 1, 1));
        arrivalOrder.add(new Patient("Carla", 2, 2));
        arrivalOrder.add(new Patient("Dave", 1, 3));

        System.out.println("=== Arrival Order ===");
        System.out.println("Arrival Order: " + arrivalOrder);
        System.out.println();

        
        PriorityQueue<Patient> treatmentQueue = new PriorityQueue<>(
            (p1, p2) -> {
                if (p1.severity != p2.severity)
                    return p1.severity - p2.severity; 
                else
                    return p1.arrivalOrder - p2.arrivalOrder;
            }
        );

        treatmentQueue.addAll(arrivalOrder);

        System.out.println("=== Treatment Order ===");
        while (!treatmentQueue.isEmpty()) {
            System.out.println("Treating: " + treatmentQueue.poll());
        }
    }
}
