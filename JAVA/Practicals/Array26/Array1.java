//user input
//print average of array elements

import java.util.*;

class Array1{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int arrSize = sc.nextInt();

		int arr[] = new int[arrSize];
		int sum=0;

		for(int i=0;i<arr.length;i++){
			System.out.println("Enter Element: ");
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<arr.length;i++){
			 sum +=arr[i];
		}
		int avg= sum/arrSize;
		System.out.println("Array elements average "+avg);
	}
}

