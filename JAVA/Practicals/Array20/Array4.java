//take user input for array elements
//ask user to take array size and array elements
//ask user to put element to be search

import java.util.*;
class Array4{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int arrSize=sc.nextInt();

		int arr[]=new int [arrSize];

		//input elements

		System.out.println("Enter arry elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
	
		//print elements
		System.out.println("Elements are: ");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
			
		System.out.println("Enter number to be search: ");
		int num=sc.nextInt();
		for(int i=0;i<arr.length;i++){
			if(num==arr[i]){
				System.out.println(arr[i]+"founde at index "+i);
			}
		}
			



	}
}
