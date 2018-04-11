package com.cg;

public class Date {
	int day,month,year;
public Date(){    
		day=0;
		month=0;
		year= 0;
		}
public Date(int day, int month, int year){
this.day=day;
this.month=month;
this.year=year;
}
 @Override
public String toString() {
	 String formateddate = day + "/" + month + "/" + year;
	 return formateddate;
	
}

public Invoice[] getInvoices(){
return null;
}
class Invoice{
}

}