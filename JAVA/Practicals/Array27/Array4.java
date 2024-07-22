//check the first duplicate element in the array

import java.util.*;

class Array4{
	public static void main(String[]arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of an Array" );
		int arrSize = sc.nextInt();

		int arr[]= new int[arrSize];
		
		System.out.println("Enter the array elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]= sc.nextInt();
		}
		
		int index=0;
		boolean flag= false;
		for(int i=0;i<arr.length;i++){
			
			for(int j=i+1;j<arr.length;j++){
				 if(arr[i]==arr[j]){
					index=i;
					flag=true;
					break;
				 }
			}
			if(flag==true){	
				break;
			}

		}
		System.out.println("first duplicate element is preset at index: "+index);

	}
}
