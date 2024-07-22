//find factorial of each element in the array


import java.util.*;

class Array10{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int arrSize = sc.nextInt();

		int arr[] = new int[arrSize];
	
		System.out.println("enter the elements of array: ");

		for(int i =0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		
		}
			
		System.out.println("Factorial of Number in array: ");
		//int fact = 1;
		for( int i=0;i<arr.length;i++){
			int fact = 1;
			for(int j=1;j<=arr[i];j++){
				fact*=j;
			}
			System.out.println(fact);
		}

	      /*	for( int i=0;i<arr.length;i++){
			System.out.println(fact);
		}
		*/

	}

	
}
		
