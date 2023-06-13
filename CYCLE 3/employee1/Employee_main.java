import java.util.Scanner;
public class Employee_main{
public static void main(String[] args) {
System.out.println("\nName:CHRISTEENA JOY\nReg No:22MCA020\nCourse Code and Name: 20MCA132  OBJECT ORIENTED PROGRAMMING LAB\nDate:07/06/2023\n\n");
System.out.println("Enter the No. of Employee's");
    Scanner sc1 = new Scanner(System.in);
    int num = sc1.nextInt();
    Teacher arr[]=new Teacher[num];
    for(int i =0;i<num;i++)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Employee id: ");
        int Empid=sc.nextInt();
        System.out.println("Enter Employee Name: ");
        String Name=sc.next();
        System.out.println("Enter Salary: ");
        int Salary=sc.nextInt();
        System.out.println("Enter Address: ");
        String Address=sc.next();
        System.out.println("Enter department: ");
        String dept=sc.next();
        System.out.println("Enter Subject: ");
        String subject=sc.next();
        arr[i]=new Teacher(Empid,Name,Salary,Address,dept,subject);
    

    }
    System.out.println("\n********Informations of all the employee's************");
    for(int i=0;i<num;i++){
        int j=i+1;
        System.out.println("\n"+j+").");
        arr[i].display();
        
 }
 sc1.close();
 }

}


