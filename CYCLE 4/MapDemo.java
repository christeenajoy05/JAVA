import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDemo {
    public static void main(String[] args) {
        System.out.println("\nName:CHRISTEENA JOY\nReg No:22MCA020\nCourse Code and Name: 20MCA132  OBJECT ORIENTED PROGRAMMING LAB\nDate:23/06/2023\n\n");
        // Create a Map
        Map<String, Integer> map = new HashMap<>();

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Get the number of elements to add
        System.out.print("Enter the number of elements to add: ");
        int numElements = scanner.nextInt();

        // Get the elements from the user
        System.out.println("Enter the elements (key-value pairs):");
        for (int i = 0; i < numElements; i++) {
            System.out.print("Enter key: ");
            String key = scanner.next();

            System.out.print("Enter value: ");
            int value = scanner.nextInt();

            // Add the element to the map
            map.put(key, value);
        }

        // Display the initial map
        System.out.println("Initial Map: " + map);

        // Get the key to change its value
        System.out.print("Enter the key to change its value: ");
        String keyToChange = scanner.next();

        // Check if the key exists in the map
        if (map.containsKey(keyToChange)) {
            System.out.print("Enter the new value: ");
            int newValue = scanner.nextInt();

            // Change the value of the key
            map.put(keyToChange, newValue);
        } else {
            System.out.println("Key does not exist in the map.");
        }

        // Display the updated map
        System.out.println("Updated Map: " + map);

        // Get the key to remove from the map
        System.out.print("Enter the key to remove from the map: ");
        String keyToRemove = scanner.next();

        // Remove the key if it exists in the map
        if (map.containsKey(keyToRemove)) {
            map.remove(keyToRemove);
        } else {
            System.out.println("Key does not exist in the map.");
        }

        // Display the final map
        System.out.println("Final Map: " + map);

        // Close the scanner
        scanner.close();
    }
}

