
public class Employee {
	int empid;
	String firstName;
	String lastName;
		static int count=0;	
	int salary;
	char grade;
	int dd, mm, yyyy;
	
public Employee() {

	firstName= "";
	lastName="";
	salary=0;
	grade= ' ';
			
}
public Employee(String fn, String ln, int sal, char grade, int dd, int mm, int yyyy) {
	
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
	system.out.println("empid :" + count);
	system.out.println("firstName :" + firstName);
	system.out.println("lastName :" + lastName);
	system.out.println("salary :" + salary);
	system.out.println("grade :" + grade);
	system.out.println("Date :" +dd+ "/" +mm "/" +yyyy);
	
}	
public Invoice[] getInvoices() {
	return null;
	
}
class Invoice
}
