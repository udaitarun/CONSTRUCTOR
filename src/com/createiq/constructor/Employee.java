package com.createiq.constructor;


public class Employee {
	

		//Employee 
		Employee(String name, int id, double salary){
			
			System.out.println("Employee details \n");
			System.out.println("Employee name    : "+name);
			System.out.println("Employee id      : "+id);
			System.out.println("Employee salary  : "+salary);
		}
		
		
		//Bank account
			Employee( String accountNum, String Hname,String Bname,String IFSC){
			
			System.out.println("Account details \n");
			System.out.println("Account numnber   		 : "+accountNum);
			System.out.println("Account Holder name 	    : "+Hname);
			System.out.println("Branch 					 : "+Bname);
			System.out.println("IFSC Code				 : "+IFSC);
		}
		
			//Student
			Employee(String name, short rollNo,int marks){
				
				System.out.println("Student details \n");
				System.out.println("Student name    	 : "+name);
				System.out.println("Student RollNo       : "+rollNo);
				System.out.println("Student Marks        : "+marks);
			}
		
		//address
			Employee(String name,int dob,char gender,long adarnum,String address, long phonenum) {
				System.out.println("Adhar Card Details \n ");
				System.out.println("Name              :" + name+"\n");
				System.out.println("Date of Birth     : "+dob+"\n");
				System.out.println("gender            : "+gender+"\n");
				System.out.println("adarnumber        : "+adarnum+"\n");
				System.out.println("address           : "+address+"\n");
				System.out.println("phnnumber         : "+phonenum+"\n");
				
				}
			
			Employee(String cardname,long cardrnumber,byte cvvnumber) {
				
				
				System.out.println("Credit Card Details \n ");
				System.out.println("Card name				: "+cardname+"\n");
				System.out.println("Card id 				:" + cardrnumber+"\n");
				System.out.println("CvvNumber 				: "+cvvnumber+"\n");
			}
			
		
		
		
		//out puts
		
			public static void main(String[] args) {
				//Employee
				
				Employee em=new Employee("uday",123,100000.00);
				Employee em1 = new Employee("Vinith",124,1200.00);
				
				//Bank 
				System.out.println("");
				Employee bank=new Employee("0000089898989898989","Praveen", "SR NAGAR","SBI00012");
				
			//student
				Employee stu=new Employee("sai",123,600);
				
				// adress
				Employee add=new Employee("afrin",1996,'M',989898999999l,"SR NAGAR",9989585817l);
				
				
				//Credit card
				Employee card=new Employee("sbi",989898999999l,(byte)817);
				
				
				Employee card1=new Employee("union",989898999999l,(byte)917);
				
			
			
		}

}
