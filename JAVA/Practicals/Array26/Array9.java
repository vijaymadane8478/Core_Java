//user input
//convert
//replace with # if not in range of a-z

import java.util.*;

class Array9{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int arrSize = sc.nextInt();

		char arr[] = new char[arrSize];
			
	
		//input
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter Element: ");
			arr[i]=sc.next().charAt(0);
		}

		//replace
		for(int i=0;i<arr.length;i++){
			if(Character.isUpperCase(arr[i])){
				arr[i]='#';
				}
		}

		//print
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
	}
}

