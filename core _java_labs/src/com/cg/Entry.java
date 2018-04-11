package com.cg;

import java.util.*;
class Entry{

	
	public static void main(String[] args){
	int i;
	int j;
	int n;
	Date joiningdate;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of employeee");
        n = sc.nextInt();
	
	
	      for (i=1;i<=n;i++)
                {
		 
	System.out.println("-------------------------------------");	

	System.out.println("Enter your firstname  :");
        String firstName=sc.next();
	
	System.out.println("Enter your lastname   :");
        String lastName=sc.next();
        System.out.println("Enter your salary     :");
        int salary=sc.nextInt();
	System.out.println("Enter your grade      :");
        char grade=sc.next().charAt(0);


      System.out.println("enter date");
      int dd = sc.nextInt();
      System.out.println("enter month");
      int mm = sc.nextInt();
      System.out.println("enter year");
      int yyyy = sc.nextInt();
      joiningdate = new Date(dd,mm,yyyy) ;
	 Employee e = null; 
         e = new Employee(firstName, lastName, salary, grade, joiningdate);
           e.displayDetails();
       e.getInvoices();
      
       
                }	
	}
}