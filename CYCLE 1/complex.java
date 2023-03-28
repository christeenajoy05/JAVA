public class complex{
    double real, img;
    
    complex(double r, double i){
        this.real = r;
        this.img = i;
    }
    
    public static complex sum(complex c1, complex c2){
        complex temp = new complex(0, 0);
        
        temp.real = c1.real + c2.real;
        temp.img =c1.img + c2.img;
        return temp;
    }
    
    public static void main(String args[]){
     System.out.println("\nName:CHRISTEENA JOY\nReg No:22MCA020\nCourse Code and Name: 20MCA132  OBJECT ORIENTED PROGRAMMING LAB\nDate:28/03/2023\n\n");
        complex c1 = new complex(7.5, 4.4);
        complex c2 = new complex(1.9, 76.5);
        complex temp = sum(c1, c2);
        
        System.out.println("Sum is :" + temp.real+" + "+ temp.img + "i");
    }
     
}
