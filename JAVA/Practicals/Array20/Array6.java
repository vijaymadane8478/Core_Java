//take user input
//print product of elements at odd index

import java.util.*;
class Array6{
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
		int product=1;
		for(int i=0;i<arr.length;i++){
			if(i%2==1){
				product*=arr[i];
			}
		}
		System.out.println("Product of elements at odd index: "+product);
	}
}

		

