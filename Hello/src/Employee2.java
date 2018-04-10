import java.util.*;
class Employee2{
	
static int count=0;
	
	public static void main(String[] args){
	int i;
	int j;
	String firstName = null;
	String lastName = null;
	 int salary=0;
	 String grade=null;
	 int dd=0;
	 int mm=0;
	 int yyyy=0;
	 
	 
	 
	 	

        Scanner sc=new Scanner(System.in);
	
	
	      for (i=1;i<3;i++)
                {
		 
	count++;
	System.out.println("----------------------------------------------------------------------------------------");	

	System.out.println("Enter your firstname  :");
        firstName=sc.next();
	
	System.out.println("Enter your lastname   :");
        lastName=sc.next();

        System.out.println("Enter your salary     :");
        salary=sc.nextInt();

	System.out.println("Enter your grade      :");
        grade=sc.next();
        
        if ( grade.length() != 1 && ('a' <= grade.charAt(0) && grade.charAt(0) <= 'b')){
            System.out.println("valid input");
       }else{
            System.out.println("invalid input, again enter grade");
            grade=sc.next();
       }

      System.out.println("enter date");
      dd = sc.nextInt();
      if(dd > 31)
      {
    	  System.out.println("Date must be less than 31");
    	  dd = sc.nextInt();
      }
      System.out.println("enter month");
      mm = sc.nextInt();
      if(mm > 12)
      {
    	  System.out.println("month must be less than 12");
    	  mm = sc.nextInt();
      }
      System.out.println("enter year");
      yyyy = sc.nextInt();
      if(yyyy < 1500 || yyyy > 2099)
      {
    	System.out.println("year is invalid");
    	yyyy = sc.nextInt();
      }
   
      Employee e = null; 
      e = new Employee(firstName, lastName, salary, grade, dd , mm, yyyy);
     
    e.displayDetails();

   
   e.getInvoices();
	}

	  
	 	
	
	}       
}

     	