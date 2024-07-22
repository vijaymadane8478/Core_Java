//user input
//print elements in array before user given input
//

import java.util.*;
class Array10{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Arrsize: " );
		int arrSize=sc.nextInt();

		char arr[]= new char[arrSize];

		//inputi
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter element: ");
			arr[i]=sc.next().charAt(0);
		}

		//check input
		System.out.println("Enter Character key: ");
	       	char cstop=sc.next().charAt(0);

		for(int i=0;i<arr.length;i++){
			if(arr[i]!=cstop){
				System.out.println(arr[i]);
			}
		}
	}
}

