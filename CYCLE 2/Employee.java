import java.util.*;

public class Employee {
    int eNo;
    String eName;
    float eSalary;
    

    public void empl() {    
                                                        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Employee Number:");
        eNo = s.nextInt();
        System.out.print("Enter the Employee Name:");
        eName = s.next();
        System.out.print("Enter the Employee Salary:");
        eSalary = s.nextFloat();
    }

    public void display() {
        System.out.println(" Employee Number : " + eNo);
        System.out.println(" Employee Name : " + eName);
        System.out.println(" Employee Salary : " + eSalary);
    }

    public static void main(String args[]) {
    System.out.println("\nName:CHRISTEENA JOY\nReg No:22MCA020\nCourse Code and Name 20MCA132  OBJECT ORIENTED PROGRAMMING LAB\nDate :12/04/2023\n\n"); 
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Employees:");
        n = sc.nextInt();
        Employee obj[] = new Employee[n];

        for (int i = 0; i < n; i++) {
            obj[i] = new Employee();
            obj[i].empl();
        }

        System.out.println(".............Employee Details............ ");

        for (int i = 0; i < n; i++) {
            obj[i].display();
        }

        System.out.println("Enter the number to search an employee");
        int x = sc.nextInt();
        int flag = 0;

        for (int i = 0; i < n; i++) {
            if (obj[i].eNo == x) {
                flag = 1;
                obj[i].display();
                break;
            }
        }

        if (flag == 0) {
            System.out.println("Employee with given number not found.");
        }
    }
}



