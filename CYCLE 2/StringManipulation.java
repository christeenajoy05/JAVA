import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
    System.out.println("\nName:CHRISTEENA JOY\nReg No:22MCA020\nCourse Code and Name: 20MCA132  OBJECT ORIENTED PROGRAMMING LAB\nDate:12/04/2023\n\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("The length of the string is: " + str.length());
        System.out.println("The string in uppercase is: " + str.toUpperCase());
        System.out.println("The string in lowercase is: " + str.toLowerCase());
        System.out.println("The first character of the string is: " + str.charAt(0));
        System.out.println("The last character of the string is: " + str.charAt(str.length() - 1));

        System.out.print("Enter a character to search for: ");
        char searchChar = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == searchChar) {
                count++;
            }
        }
        System.out.println("The character '" + searchChar + "' occurs " + count + " times in the string.");
    }
}

