/*
 * store employee age of an compant
 * take count of emp from user
 *take user input
 */

import java.util.*;

class Array8{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of emp: ");
		int empno= sc.nextInt();

		int emparr[]= new int[empno];

		for(int i=0;i<emparr.length;i++){
			System.out.println("Enter Age emp no "+i+": " );
			emparr[i]=sc.nextInt();
		}
		System.out.println("ages are: ");
		for(int i=0;i<emparr.length;i++){
			System.out.println(emparr[i]);
		}
	}
	
}
