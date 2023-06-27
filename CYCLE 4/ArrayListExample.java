import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
    System.out.println("\nName:CHRISTEENA JOY\nReg No:22MCA020\nCourse Code and Name: 20MCA132  OBJECT ORIENTED PROGRAMMING LAB\nDate:23/06/2023\n\n");
        // Create an ArrayList to store strings
        List<String> stringList = new ArrayList<>();

        // Add elements to the list
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Mango");

        // Print the original list
        System.out.println("Original List: " + stringList);

        // Accessing elements by index
        String firstElement = stringList.get(0);
        System.out.println("First Element: " + firstElement);

        // Modifying an element
        stringList.set(1, "Grapes");
        System.out.println("Modified List: " + stringList);

        // Checking if an element exists in the list
        boolean containsMango = stringList.contains("Mango");
        System.out.println("Contains Mango? " + containsMango);

        // Removing an element
        stringList.remove("Orange");
        System.out.println("List after removing Orange: " + stringList);

        // Sorting the list
        Collections.sort(stringList);
        System.out.println("Sorted List: " + stringList);

        // Reversing the list
        Collections.reverse(stringList);
        System.out.println("Reversed List: " + stringList);

        // Size of the list
        int size = stringList.size();
        System.out.println("Size of the list: " + size);

        // Clearing the list
        stringList.clear();
        System.out.println("List after clearing: " + stringList);
    }
}

