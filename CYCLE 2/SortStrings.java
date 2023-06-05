import java.util.*;

public class SortStrings {
    public static void main(String[] args){
    System.out.println("\nName:CHRISTEENA JOY\nReg No:22MCA020\nCourse Code and Name: 20MCA132  OBJECT ORIENTED PROGRAMMING LAB\nDate:12/04/2023\n\n");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the length :");
        int length = sc1.nextInt();
        String[] names = new String[length];
        System.out.println("Enter the strings:");

        for (int i = 0; i < length; i++) {
            names[i] = sc1.next();
        }

        Arrays.sort(names);

        System.out.println("\nThe names in alphabetical order : ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        sc1.close();
    }
}


