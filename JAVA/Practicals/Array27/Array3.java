//check array is palindrome or not

import java.util.*;

class Array3{
	public static void main(String[]arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of an Array" );
		int arrSize = sc.nextInt();

		int arr[]= new int[arrSize];
		
		System.out.println("Enter the array elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]= sc.nextInt();
		}
		boolean flag=false;
		for(int i=0;i<arr.length;i++){
			if(arr[i]== arr[arrSize-i-1]){
				flag=true;
			}else{
				flag=false;
			}
		}
	
			if(flag==true){
				System.out.println("array is palindrome");
			}else{
				System.out.println("arrry is not palindrome");
			}
	}
	
}
