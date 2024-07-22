//user input
//find 2nd largest element in array

import java.util.*;

class Array3{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int arrSize = sc.nextInt();

		int arr[] = new int[arrSize];
	
		int max1=arr[0];
		int max2=arr[0];

		for(int i=0;i<arr.length;i++){
			System.out.println("Enter Element: ");
			arr[i]=sc.nextInt();
		}
		
		//int max1=arr[0];

		for(int i=0;i<arr.length;i++){
			if(max1<arr[i]){
				max1=arr[i];
			}
		}

		//int max2=arr[0];

		for(int i=0;i<arr.length;i++){
			if(max1!=arr[i]){
				if(max2<arr[i]){
					max2=arr[i];
				}
			}
		}
	System.out.println("2nd largest number in array: "+max2);	
	}
}

