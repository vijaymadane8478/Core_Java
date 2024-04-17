import java .util.*;
class oneDarray15{
	public static void main(String[]args){

		int empId[]= new int[3]{10,20,30}; //Array creation with both dimension exprerssion and intialization is ilegal

		System.out.println(empId[0]);
		System.out.println(empId[1]); 
		System.out.println(empId[2]);
		
		empId[0]=10;
		empId[1]=20;
		empId[2]=30;

		System.out.println(empId[0]); 
		System.out.println(empId[1]); 
		System.out.println(empId[2]);
		
	}
}	
