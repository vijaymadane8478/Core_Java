//take user input for array elements
//print even number from arrary
//print count of even numbers

import java.util.*;
class Array1{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int arrSize=sc.nextInt();

		int arr[]=new int[arrSize];

		//input elements

		for(int i=0;i<arr.length;i++){
			System.out.println("Enter arry elements: ");
			arr[i]=sc.nextInt();
		}

		//print all array
		System.out.println("Orignal Arry Elements: ");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		//print even number from array

		int count=0;
		System.out.println("even Arry Elements: ");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				System.out.println(arr[i]);
				count++;
			}
		}
		System.out.println("Count of Even elments is"+count);
	
	}
}
