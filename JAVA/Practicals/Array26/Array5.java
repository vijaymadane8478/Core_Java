//user input
//reverse the array elements

import java.util.*;

class Array5{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int arrSize = sc.nextInt();

		int arr[] = new int[arrSize];
			
		int temp=0;
		
		//inpute
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter Element: ");
			arr[i]=sc.nextInt();
		}
		
		//reverser

		for(int i=0;i<arr.length/2;i++){
			temp=arr[i];
			arr[i]=arr[arrSize-i-1];
			arr[arrSize-i-1]=temp;
		}
		//reverse array
		System.out.println("Reversed Array: ");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}

		}
		
}

