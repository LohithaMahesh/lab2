public class Entry 
{
	String fName, lName, jDate;
	char Grade;
	double salary;
	static int count = 0,id = 1001;
	public static void main(String args[]) throws Exception
	{
	Employee e=new Employee(id++,"Lohitha", "Chaluvadi",4000.00,'A',"Apr-2018");
	Employee e1=new Employee(id++,"Mahesh", "Chaluvadi", 4000.00,'A', "Mar-2018");
	Employee e2=new Employee(id++,"Madhav", "kondapalli",  4000.00,'A', "Jun-2018");
	Employee e3=new Employee(id++,"Manasa", "narre", 4000.00,'A',"Jan-2018" );
	Employee e4=new Employee(id++,"Saiprakash", "Turaka",4000.00,'A',"May-2018" );
	
	}
	
}	
	
