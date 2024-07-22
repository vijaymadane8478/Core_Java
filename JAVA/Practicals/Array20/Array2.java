//take user input for array elements
//print sum of elements divisible by 3
//print sum of divisible elements

import java.util.*;
class Array2{
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
		//print  number divisible by from array

		int sum=0;
		System.out.println(" Arry Elements divisible by 3: ");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%3==0){
				System.out.println(arr[i]);
				sum+=arr[i];
			}
		}
		System.out.println("Sum of Elements divisible by 3: "+sum);
	
	}
}
