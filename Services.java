package bha.com;

import java.util.ArrayList;
import java.util.Scanner;

public class Services {
	Scanner sc=new Scanner(System.in);
ArrayList<Employee> a=new ArrayList();

	Employee e=new Employee(454, "bhavani");
	Employee e1=new Employee(431, "bhanu");
	
	public Services(){
		a.add(e);
		a.add(e1);
		
	}
	
	public void addEmp() {
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("enter the Id ");
		int Id=sc.nextInt();
		
		Employee e2=new Employee(Id, name);
		a.add(e2);
		System.out.println(a);
		for(Employee obj: a ){
			System.out.println(obj.Id +" " + obj.name);
		}	
		//System.out.println("Employee added successfully");
	}
	
	public void deleteEmp() {
		System.out.println("enter the delete Id number:");
		int Id=sc.nextInt();
		boolean found=false;
		Employee emdelete=null;
		for(Employee obj:a) {
			if(Id==obj.Id) {
				found=true;
				emdelete=obj;
			}
		}
		if(found==true) {
			a.remove(emdelete);
			System.out.println("Record deleted");
		}
		else {
			System.out.println("record not found");
		}
		for(Employee obj:a) {
			System.out.println(obj.Id+ " " + obj.name);
		}
		//System.out.println("Delete successfully"); 
	}
	
	public void updateEmp() {
		System.out.println("enter the Id");
		int Id=sc.nextInt();
		
		for(Employee obj:a) {
			if(Id==obj.Id) {
				System.out.println("enter the updated name");
				String upname=sc.next();
				obj.setName(upname);
			}
		}
		for(Employee obj:a) {
			System.out.println(obj.Id+" "+ obj.name);
		}
		//System.out.println("update successfully");
	}
	 
}
