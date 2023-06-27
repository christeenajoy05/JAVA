import java.util.Arrays;

public class BubbleSort1 {
    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap arr[j] and arr[j + 1]
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
    System.out.println("\nName:CHRISTEENA JOY\nReg No:22MCA020\nCourse Code and Name: 20MCA132  OBJECT ORIENTED PROGRAMMING LAB\nDate:23/06/2023\n\n");
        Integer[] numbers = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        String[] names = { "John", "Alice", "Bob", "Diana", "Carol" };

        System.out.println("Before sorting: " + Arrays.toString(numbers));
        bubbleSort(numbers);
        System.out.println("After sorting: " + Arrays.toString(numbers));

        System.out.println("Before sorting: " + Arrays.toString(names));
        bubbleSort(names);
        System.out.println("After sorting: " + Arrays.toString(names));
    }
}

