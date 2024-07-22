//take user input for array elements
//print character arrary
//print vowels and its index

import java.util.*;
class Array3{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int arrSize=sc.nextInt();

		char arr[]=new char [arrSize];

		//input elements

		System.out.println("Enter arry elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.next().charAt(0);
		}
	
		//print vowels
		System.out.println("Vowels are: ");
		for(int i=0;i<arr.length;i++){
			if(arr[i]== 'a' || arr[i]=='e'|| arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
				System.out.println(arr[i]);
				System.out.println("VOwel"+ arr[i] +" is at index "+i);
			}
		}


	}
}
