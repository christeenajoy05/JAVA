import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Stack {
    private List<Object> elements;

    public Stack() {
        this.elements = new ArrayList<>();
    }

    public void push(Object item) {
        elements.add(item);
    }

    public Object pop() {
        if (elements.isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }

        return elements.remove(elements.size() - 1);
    }

    public void remove(Object item) {
        if (elements.contains(item)) {
            elements.remove(item);
            System.out.println("Removed: " + item);
        } else {
            System.out.println("Item not found: " + item);
        }
    }

    public void display() {
        System.out.println("Stack elements: " + elements);
    }
}

public class StackMain {
     
    public static void main(String[] args) {
        System.out.println("\nName:CHRISTEENA JOY\nReg No:22MCA020\nCourse Code and Name: 20MCA132  OBJECT ORIENTED PROGRAMMING LAB\nDate:23/06/2023\n\n");
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements to push: ");
        int numElements = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < numElements; i++) {
            Object element = scanner.next();
            stack.push(element);
        }

        stack.display();

        System.out.print("Enter the element to remove: ");
        Object elementToRemove = scanner.next();
        stack.remove(elementToRemove);

        stack.display();
    }
}

