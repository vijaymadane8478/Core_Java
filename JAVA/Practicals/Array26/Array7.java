//user input
//convert
//lower to upper CASE

import java.util.*;

class Array7{
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

		for(int i=0;i<arr.length;i++){
			if(Character.isLowerCase(arr[i])){
				arr[i]=Character.toUpperCase(arr[i]);
				}
		}

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
	}
}

