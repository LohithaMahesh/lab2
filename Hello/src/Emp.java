import java.util.*;

class Emp
{
	Scanner sc;
	String fName[],lName[];
	int jDate[], sal[],id=1000,iid[];
	char grade[];

	public Emp()
	{
		sc=new Scanner(System.in);
		fName = new String[5];
		lName = new String[5];
		jDate = new int[5];
		iid = new int[5];
		sal = new int[5];
		grade = new char[5];
		accept();
	}	
	
	public static void main(String args[]) throws Exception
	{
		Emp e=new Emp();			
	}
	
	void accept()
	{
		for(int i=1;i<=2;i++)
		{
			System.out.println("");
			
			id++;
			System.out.println("Please Enter the Details for the Emp ID " + id);
			iid[i]=id;
			
			System.out.print("Enter your Name           : ");
			fName[i]=sc.next();
			
			System.out.print("Enter your SurName        : ");
			lName[i]=sc.next();
			
			System.out.print("Enter your Salary         : ");
			sal[i]=sc.nextInt();
			
			System.out.print("Enter your Joining date   : ");
			jDate[i]=sc.nextInt();
			
			System.out.print("Enter your Grade          : ");
			grade[i]=sc.next().charAt(0);
			
			System.out.println("");
		}
		display();
	}
		
	void display()
	{
		for(int i=1;i<=2;i++)
		{
			System.out.println("Details of " + i + " Employee");
			System.out.println("");
			System.out.println("ID of the Emp is     : " + iid[i]);
			System.out.println("First Name of Emp is : " + fName[i]);
			System.out.println("Last Name of Emp is  : " + lName[i]);
			System.out.println("Salary of Emp is     : " + sal[i]);
			System.out.println("Join date of Emp is  : " + jDate[i]);
			System.out.println("Grade of Emp is      : " + grade[i]);
			System.out.println("");
		}
	}
}
