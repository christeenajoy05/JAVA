import java.util.Scanner; 
class authException extends Exception 
{ 
public authException(String s) { 
super(s); 
} 
} 
public class Userauthentication 
{ 
public static void main(String[] args) { 
System.out.println("\nName:CHRISTEENA JOY\nReg No:22MCA020\nCourse Code and Name: 20MCA132  OBJECT ORIENTED PROGRAMMING LAB\nDate:21/06/2023\n\n");
String username = "student"; 
String passcode = "student123"; 
String user_name,password; 
Scanner sc = new Scanner(System.in); 
try 
{ 
System.out.println("Enter the username:"); 
user_name = sc.nextLine(); 
System.out.println("Enter the password:"); 
password = sc.nextLine(); 
if(username.equals(user_name) && passcode.equals(password)) 
{ 
System.out.println("Authentication successful..."); 
} 
else 
throw new authException("Invalid user credentials"); 
} 
catch(authException e) 
{ 
System.out.println("Exception caught "+e); 
} 
} 
} 

