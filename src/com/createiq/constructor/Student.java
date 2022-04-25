package com.createiq.constructor;

public class Student {
				
		String name;
		int rollNo;
		
		public  Student(String name,int rollNo){
		
			this.name=name;
			this.rollNo=rollNo;	
		
			
		}
		
		void display() {
			System.out.println(name);
			System.out.println(rollNo);
		}
		 
		
		public static void main(String[] args) {
			Student s1=new Student("udai",101);
			Student s2=new Student("Ravi",102);
			s2.display();
			s1.display();
			
			
			
			
		}
	}


