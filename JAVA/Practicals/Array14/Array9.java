/*
 * take user inpurt arry length 10
 * print elements at odd index
 */

import java.util.*;
class Array9{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		int arrSize=sc.nextInt();

		int arr[]=new int[arrSize];
		//input
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter Elements: ");
			arr[i]=sc.nextInt();
		}

		//print elements
		for(int i=0;i<arr.length;i++){
			if(i%2==1){
				System.out.println(arr[i]);
			}
		}
	}
}
