//take user input and print the array elements divisible by 4 and its index is...

import java.util.*;

class Array7{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Arrary Size: ");
		int arrSize=sc.nextInt();

		int [] arr=new int[arrSize];

		
		for (int i=0;i<arr.length;i++){
			System.out.println("Enter Array Elements no "+i+" : ");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Orignal Array Elements Are: ");
		for (int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

		
		
		System.out.println();
		System.out.println(" Array Elements divsible 4 by Are: ");{
		for (int i=0;i<arr.length;i++){
			if(arr[i]%4==0){
				System.out.println(arr[i]+" is divisible by 4 at index"+i);
			}
		}
	
		}
	}
	
	
}
