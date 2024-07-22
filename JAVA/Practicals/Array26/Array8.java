//user input
//find number occuerene of character

import java.util.*;

class Array8{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int arrSize = sc.nextInt();

		char arr[] = new char[arrSize];
			
		int count=0;

		//input 
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter Element: ");
			arr[i]=sc.next().charAt(0);
		}
		
		System.out.print("Enter character to check: " );
		char search=sc.next().charAt(0);

		for(int i=0;i<arr.length;i++){	
			if(arr[i]==search){
				count++;
			}
		}
		
		
		System.out.println(search+ " occered " +count+ " times in array");
		}
		
}

