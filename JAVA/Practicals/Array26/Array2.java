//user input
//print diff of min element and maximum element

import java.util.*;

class Array2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int arrSize = sc.nextInt();

		int arr[] = new int[arrSize];
	

		for(int i=0;i<arr.length;i++){
			System.out.println("Enter Element: ");
			arr[i]=sc.nextInt();
		}
		
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}

		int min=arr[0];		
		for(int i=0;i<arr.length;i++){
			if(min>arr[i]){
				min=arr[i];
			}
		}

	int diff=max-min;
	System.out.println("difference "+diff);	
	}
}

