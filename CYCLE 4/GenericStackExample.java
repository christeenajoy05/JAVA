import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Stack<T> {
    private List<T> stack;
    private int capacity;

    public Stack(int capacity) {
        this.stack = new ArrayList<>();
        this.capacity = capacity;
    }

    public void push(T element) {
        if (stack.size() >= capacity) {
            throw new IllegalStateException("Stack is full");
        }
        stack.add(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.remove(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

public class GenericStackExample {
    public static void main(String[] args) {
    System.out.println("\nName:CHRISTEENA JOY\nReg No:22MCA020\nCourse Code and Name: 20MCA132  OBJECT ORIENTED PROGRAMMING LAB\nDate:23/06/2023\n\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the capacity of the stack: ");
        int capacity = scanner.nextInt();

        Stack<Integer> integerStack = new Stack<>(capacity);

        System.out.println("Stack created with capacity " + capacity);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    int element = scanner.nextInt();
                    try {
                        integerStack.push(element);
                        System.out.println("Element pushed: " + element);
                    } catch (IllegalStateException e) {
                        System.out.println("Stack is full. Cannot push element.");
                    }
                    break;
                case 2:
                    try {
                        int poppedElement = integerStack.pop();
                        System.out.println("Element popped: " + poppedElement);
                    } catch (IllegalStateException e) {
                        System.out.println("Stack is empty. Cannot pop element.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}

