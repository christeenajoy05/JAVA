import package_graphics.*;
import java.util.*;
public class main_graphics {

public static void main(String []args){
System.out.println("\nName:CHRISTEENA JOY\nReg No:22MCA020\nCourse Code and Name: 20MCA132  OBJECT ORIENTED PROGRAMMING LAB\nDate:16/06/2023\n\n");
package_graphics testObj = new package_graphics();
int l,h,r,a,c,d;
Scanner s=new Scanner(System.in);
System.out.println("Enter the length for rectangle");
l=s.nextInt();
System.out.println("Enter the breadth for rectangle");
h=s.nextInt();
System.out.println("Enter the radius of circle");
r=s.nextInt();
System.out.println("Enter the side for Square");
a=s.nextInt();
System.out.println("Enter the breadth for triangle");
c=s.nextInt();
System.out.println("Enter the height for triangle");
d=s.nextInt();
System.out.println("area of rectangle= "+testObj.recArea(l,h));
System.out.println("area of circle= "+testObj.cirArea(r));
System.out.println("area of square= "+testObj.squArea(a));
System.out.println("area of triangle= "+testObj.triArea(c,d));
}
}
