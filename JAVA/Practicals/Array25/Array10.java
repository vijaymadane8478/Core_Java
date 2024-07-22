//print prime number in the array

import java.util.*;
class Array10{
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
		
		int product=1;
		for(int i=0;i<arr.length;i++){
			int num=arr[i];
			int count=0;
			while(num>0){
				if(arr[i]%num==0){
					//count++; //prime num check
				}
				num--;
				product *=num;
			}	
		}

		System.out.println(product);	
	}
	
}
