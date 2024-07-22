//check given array is in desending order 


import java.util.*;

class Array1{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int arrSize = sc.nextInt();

		int arr[] = new int[arrSize];

		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		boolean flag = false;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]<arr[i+1]){
				flag=true;
			}
		}

		if(flag==true){
			System.out.println("Array is not in desending order");
		}else{
			System.out.println("Array is in desending order");
		}


	}
}

