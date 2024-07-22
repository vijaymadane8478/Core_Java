//find 2nd smallest element in array


import java.util.*;

class Array9{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int arrSize = sc.nextInt();

		int arr[] = new int[arrSize];
	
		System.out.println("enter the elements of array: ");

		for(int i =0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		
		}
		
		
		for( int i=0;i<arr.length;i++){
			arr[i]=arr[i]+1;
		}

		for( int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}

	}

	
}
		
