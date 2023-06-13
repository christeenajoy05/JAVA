public class Teacher extends Employee{
String department,Subjects;
public Teacher(int Empid,String name,int Salary,String a,String d,String s){
super(Empid,name,Salary,a);
this.department=d;
this.Subjects=s;
}

public String getDepartment(){
return department;
}

public String getSubjects(){
return Subjects;
}

 public void display() {
 System.out.println("Employee ID: " + getEmpid());
 System.out.println("Name: " + getName());
 System.out.println("Salary: " + getSalary());
 System.out.println("Address: " + getAddress());
 System.out.println("Department: " + department);
 System.out.println("Subjects Taught: " + Subjects);
 System.out.println("-------------------------");
    }

}
