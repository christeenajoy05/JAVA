import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        System.out.println("\nName: CHRISTEENA JOY\nReg No: 22MCA020\nCourse Code and Name: 20MCA132 OBJECT ORIENTED PROGRAMMING LAB\nDate: 23/06/2023\n\n");

        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new PriorityQueue<>();

        System.out.print("Enter the number of elements to enqueue: ");
        int numElements = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < numElements; i++) {
            int element = scanner.nextInt();
            queue.offer(element);
        }

        System.out.println("Queue elements: " + queue);

        System.out.println("Removed element: " + queue.poll());
        System.out.println("Removed element: " + queue.poll());

        System.out.println("Updated queue elements: " + queue);
    }
}

