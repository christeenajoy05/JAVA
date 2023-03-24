public class product{
 String pcode;
 String pname;
 int price;


public product(String pcode_get,String pname_get,int price_get)
{
pcode=pcode_get;
pname=pname_get;
price=price_get;
}

public int get_price(){
return price;
}

public static void main(String[] args){
 System.out.println("Name:CHRISTEENA JOY\nReg No:22MCA020\nCourse Code and Name: 20MCA132  OBJECT ORIENTED PROGRAMMING LAB\nDate:24/03/2023\n\n");
product p1=new product("A123w2r4","PHONE", 2);
product p2=new product("B12Gfa23","TV", 24);
product p3=new product("C65Ahy89","LAPTOP", 90);


if(p1.price<=p3.price&&p1.price<=p2.price)
System.out.println("Lowest priced  product ID is :"+p1.pcode+" and Product is "+p1.pname);
if (p3.price <= p1.price && p3.price <= p2.price) 
System.out.println("Lowest priced product ID is  : " + p3.pcode+" and Product is "+p1.pname);
if (p2.price <= p3.price && p2.price <= p1.price) 
System.out.println("Lowest priced product ID is  : " + p2.pcode+" and Product is "+p1.pname);

}
}
