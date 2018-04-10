
public class Employee {
	int empid;
	String firstName;
	String lastName;
		static int count=0;	
	int salary;
	String grade;
	int Date;
	int dd, mm, yyyy;
	
public Employee() {

	firstName= "";
	lastName="";
	salary=0;
	grade=null;
			
}
public Employee(String fn, String ln, int sal, String grade, int dd, int mm, int yyyy) {
	
	this.firstName=fn;
	this.lastName=ln;
	this.salary=sal;
	this.grade=grade;
	this.dd=dd;
	this.mm=mm;
	this.yyyy=yyyy;
	
}
public void displayDetails() {
		
	count++;
	System.out.println("empid     :" + count);
	System.out.println("firstName :" + firstName);
	System.out.println("lastName  :" + lastName);
	System.out.println("salary    :" + salary);
	System.out.println("grade     :" + grade);
	System.out.println("Date      :" + dd + "/" + mm + "/" +yyyy);
	
}	
public Invoice[] getInvoices() {
	return null;
	
}
class Invoice {
	
}
}

