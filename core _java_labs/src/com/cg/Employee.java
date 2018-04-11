package com.cg;

public class Employee {
    int empid;
 String firstName;
 String lastName;
	static int count = 0; 
int salary,id;
char grade;
Date jdate;


public Employee(String fn,String ln,int sal, char grd,Date jdate){
this.firstName=fn;
this.lastName=ln;
this.salary=sal;
this.grade=grd;
this.jdate=jdate;
count++;
id=count;
}
public void displayDetails(){
System.out.println("empid      : "+id);
System.out.println("Firstname  : "+firstName);
System.out.println("lastName   : "+lastName);
System.out.println("salary     : "+salary);
System.out.println("grade      : "+grade);
System.out.println("joiningDate: "+jdate);

}


public Invoice[] getInvoices(){
return null;
}
class Invoice{
}
}	


