public class Employee{
int Empid;
String Name;
int Salary;
String address;

public Employee(int e,String n,int s,String a){
this.Empid=e;
this.Name=n;
this.Salary=s;
this.address=a;
}

public int getEmpid(){
return Empid;
}

public String getName(){
return Name;
}

public int getSalary(){
return Salary;
}

public String getAddress(){
return address;
}
}


