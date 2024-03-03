package bha.com;

import java.util.ArrayList;
import java.util.Scanner;

public class MainDetailsEmp {
	
	public static void main(String[] args) {
//		Services s=new Services();
//		s.addEmp();
//		s.deleteEmp();
//		s.updateEmp();
		
		Scanner sc=new Scanner(System.in);
		Services obj1=new Services();
		boolean check=true;
			while(check) {
				System.out.println("enter the your choice :");
				int choice=sc.nextInt();
			switch(choice) {
			case 1:
				obj1.addEmp();
				break;
			case 2:
				obj1.deleteEmp();
				break;
			case 3:
				obj1.updateEmp();
				break;
				
			default :
				check=false;
			}
			}
	}
}
