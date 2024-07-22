//user input
//find number occuer more than 2 time or equals 2 time

import java.util.*;

class Array4{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int arrSize = sc.nextInt();

		int arr[] = new int[arrSize];
			
		int count=0;

		for(int i=0;i<arr.length;i++){
			System.out.println("Enter Element: ");
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Enter number to check: " );
		int search=sc.nextInt();

		for(int i=0;i<arr.length;i++){	
			if(search==arr[i]){
				count++;
			}
		}
		
		if(count>=2){
			System.out.println("Count in more than or equals to 2");
		}
		else{
			System.out.println("Count is less than 2");
		}

		}
		
}

