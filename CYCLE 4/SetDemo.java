import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        System.out.println("\nName:CHRISTEENA JOY\nReg No:22MCA020\nCourse Code and Name: 20MCA132  OBJECT ORIENTED PROGRAMMING LAB\nDate:23/06/2023\n\n");
        // Create a Set using LinkedHashSet
        Set<Object> set = new LinkedHashSet<>();

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements to add: ");
        int numElements = scanner.nextInt();

        System.out.println("Enter the elements:");

        // Add elements to the set
        for (int i = 0; i < numElements; i++) {
            Object element = getInput(scanner);
            set.add(element);
        }

        // Print the set
        System.out.println("Set elements: " + set);

        System.out.print("Enter the element to remove: ");
        Object elementToRemove = getInput(scanner);

        // Remove the specified element from the set
        if (set.remove(elementToRemove)) {
            System.out.println("Element removed successfully.");
        } else {
            System.out.println("Element not found in the set.");
        }

        // Print the updated set
        System.out.println("Updated set elements: " + set);

        // Close the scanner
        scanner.close();
    }

    private static Object getInput(Scanner scanner) {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        } else {
            return scanner.next();
        }
    }
}

