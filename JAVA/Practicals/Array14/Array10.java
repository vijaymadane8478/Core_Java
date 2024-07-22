//real time example to take array as input

import java.util.*;

class Array10{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int arrSize= sc.nextInt();
		
		String arr[]=new String[arrSize];

		//user input for Array of Player names
		for(int i=0;i<arr.length;i++){
		       System.out.println("Enter Player Name: ");
	       		arr[i]=sc.next();
		}
		//printing
		System.out.println("Players Are: ");
		for(int i=0;i<arr.length;i++){
		       System.out.println(arr[i]);
		}
	}
	
}	
