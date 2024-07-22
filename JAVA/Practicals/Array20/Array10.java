//take user input
//print maximum element in array

import java.util.*;
class Array10{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array: ");
		int arrSize= sc.nextInt();

		int arr[]=new int[arrSize];
		
		int max=arr[0];

		//input
		System.out.println("Enter Array Elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		//print
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println("Maximum element in array: "+max);
	}
}

		

