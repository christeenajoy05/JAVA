import java.util.HashSet;

public class HashSetComparison {
    public static void main(String[] args) {
    System.out.println("\nName:CHRISTEENA JOY\nReg No:22MCA020\nCourse Code and Name: 20MCA132  OBJECT ORIENTED PROGRAMMING LAB\nDate:23/06/2023\n\n");
        // Create the first HashSet
        HashSet<String> set1 = new HashSet<>();
        set1.add("apple");
        set1.add("banana");
        set1.add("cherry");

        // Create the second HashSet
        HashSet<String> set2 = new HashSet<>();
        set2.add("banana");
        set2.add("cherry");
        set2.add("apple");

        // Compare the HashSets
        boolean isEqual = set1.equals(set2);

        // Display the result
        System.out.println("HashSet 1: " + set1);
        System.out.println("HashSet 2: " + set2);
        System.out.println("Are the HashSets equal? " + isEqual);
    }
}

