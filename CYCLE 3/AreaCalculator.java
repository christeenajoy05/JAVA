public class AreaCalculator{

public static double calculateArea(double l,double b){
double area;
area=l*b;
return area;
}

public static double calculateArea(float r){
double area;
area=Math.PI*r;
return area;
}

public static double calculateArea(int l){
double area;
area=l*l;
return area;
}

public static void main(String args[]){
System.out.println("\nName:CHRISTEENA JOY\nReg No:22MCA020\nCourse Code and Name: 20MCA132  OBJECT ORIENTED PROGRAMMING LAB\nDate:05/06/2023\n\n");
int l=2,b=3;
float r=1.0f;
System.out.println("Area of rectangle= "+calculateArea(l,b));
System.out.println("Area of square= "+calculateArea(l));
System.out.println("Area of circle= "+calculateArea(r));
}
}

