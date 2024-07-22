//take user input
//print array elemetns greter than 5 less than 9

import java.util.*;
class Array8{
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
			if(arr[i]>=5 && arr[i]<=9){
				System.out.println(arr[i]+" is greater than 5 but less than 9");
			}
		}
	}
}

		

