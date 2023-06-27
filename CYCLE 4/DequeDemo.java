import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class DequeDemo {
    public static void main(String[] args) {
    System.out.println("\nName:CHRISTEENA JOY\nReg No:22MCA020\nCourse Code and Name: 20MCA132  OBJECT ORIENTED PROGRAMMING LAB\nDate:23/06/2023\n\n");
        // Create a Deque
        Deque<Integer> deque = new LinkedList<>();

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements to add: ");
        int numElements = scanner.nextInt();

        System.out.println("Enter the elements:");

        // Add elements at the end
        for (int i = 0; i < numElements; i++) {
            int element = scanner.nextInt();
            deque.addLast(element);
        }

        System.out.print("Enter an element to add at the last position: ");
        int lastElement = scanner.nextInt();
        deque.addLast(lastElement);

        // Print the deque
        System.out.println("Deque elements: " + deque);

        // Remove elements from the beginning and end
        int firstElement = deque.removeFirst();
        int removedLastElement = deque.removeLast();

        // Print the updated deque
        System.out.println("Updated deque elements: " + deque);
        System.out.println("Removed first element: " + firstElement);
        System.out.println("Removed last element: " + removedLastElement);

        // Close the scanner
        scanner.close();
    }
}

