//check array is in asending order 


import java.util.*;

class Array1{
	public static void main(String[]arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of an Array" );
		int arrSize = sc.nextInt();

		int arr[]= new int[arrSize];
		
		System.out.println("Enter the array elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]= sc.nextInt();
		}
		
		int asend=0;
		for(int i= 0 ;i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
				System.out.println("Array is not is asending order");
			}else{
				asend=1;
			}
	
	
		}
		
			if(asend==1);
			{
				System.out.println("Array is in asending order");
			}

	}
}
