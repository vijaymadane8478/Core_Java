//find first prime number in array


import java.util.*;

class Array6{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int arrSize = sc.nextInt();

		int arr[] = new int[arrSize];
	
		System.out.println("enter the elements of array: ");

		for(int i =0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		
		}
		//int count=0;
		for( int i=0;i<arr.length;i++){
			int count=0;
			for(int j= 1;j<=arr[i];j++){
				if(arr[i]%j==0){
					count++;
				}
			}
		if(count==2){
			System.out.println("first prime numnber found at index: "+i);
			break;
		}
		}
	}

}
	
