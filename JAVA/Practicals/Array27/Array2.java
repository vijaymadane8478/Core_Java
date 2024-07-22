//print sum of odd and even numbers in an array.

import java.util.*;

class Array2{
	public static void main(String[]arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of an Array" );
		int arrSize = sc.nextInt();

		int arr[]= new int[arrSize];
		
		System.out.println("Enter the array elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]= sc.nextInt();
		}
		
		int oddsum=0;
		int evensum=0;
		for(int i= 0 ;i<arr.length-1;i++){
			if(arr[i]%2==1){
				oddsum=oddsum+arr[i];
			}else if(arr[i]%2==0){
				evensum=evensum+arr[i];
			}else{
				System.out.println("numbe is neither odd or not even");
			}
		}
		System.out.println("OddSum= "+oddsum);
		System.out.println("Evenum= "+evensum);

	}
}
