//find composite number in array


import java.util.*;

class Array7{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int arrSize = sc.nextInt();

		int arr[] = new int[arrSize];
	
		System.out.println("enter the elements of array: ");

		for(int i =0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		
		}
		
		for( int i=0;i<arr.length;i++){
			int ccount=0;
			for(int j=1;j<arr[i];j++){
				if(arr[i]%j==0){
					ccount++;
				}
			}
			if(ccount>2){
				System.out.println(" "+arr[i]);
			}
			

		}
	}

}
	
