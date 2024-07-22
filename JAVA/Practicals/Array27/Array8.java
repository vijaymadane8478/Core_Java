//find 2nd smallest element in array


import java.util.*;

class Array8{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int arrSize = sc.nextInt();

		int arr[] = new int[arrSize];
	
		System.out.println("enter the elements of array: ");

		for(int i =0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		
		}
		
		int min1=arr[0];
		for( int i=0;i<arr.length;i++){
			if(min1>arr[i]){
				min1=arr[i];
			}
		}
		int min2=88888888;
		for(int i=0;i<arr.length;i++){
			if(min1!=arr[i]){
				if(min2>arr[i]){
					min2=arr[i];
				}
			}
		}

		System.out.println("2nd smalleset element is: "+min2);

		}
	}


	
