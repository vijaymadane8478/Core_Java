//take user input
//if user input even print alternate array elements
//else print whole arrary elements

import java.util.*;
class Array7{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array: ");
		int arrSize= sc.nextInt();

		int arr[]=new int[arrSize];
		//input
		System.out.println("Enter Array Elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		//print
		for(int i=0;i<arr.length;i++){
			if(arrSize%2==0){
				if(arr[i]%2==1){
				System.out.println(arr[i]);
				}
			}else{
				System.out.println(arr[i]);
			}
		}
	}
}

		

