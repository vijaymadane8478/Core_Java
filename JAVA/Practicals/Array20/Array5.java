//take user input
//print sum of elements at odd index

import java.util.*;
class Array5{
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
		int sum=0;
		for(int i=0;i<arr.length;i++){
			if(i%2==1){
				sum+=arr[i];
			}
		}
		System.out.println("Sum of elements at odd index: "+sum);
	}
}

		

