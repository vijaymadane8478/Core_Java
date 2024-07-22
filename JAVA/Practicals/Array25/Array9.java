//print prime number in the array

import java.util.*;
class Array9{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int arrSize=sc.nextInt();

		int arr[]=new int[arrSize];
		//input
		for (int i=0;i<arr.length;i++){
			System.out.println("Enter Elements: ");
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<arr.length;i++){
			int j=arr[i];
			int count=0;
			while(j>0){
				if(arr[i]%j==0){
					count++;
				}
				j--;
			}
			if(count==2){
				System.out.println(arr[i]);
			}
		}
	}
}
