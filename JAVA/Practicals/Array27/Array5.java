//count of digit in elements of an array


import java.util.*;

class Array5{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int arrSize = sc.nextInt();

		int arr[] = new int[arrSize];
	
		System.out.println("enter the elements of array: ");

		for(int i =0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		int rem=0;
		String arrr[] = new String[arrSize];
		for(int i=0;i<arr.length;i++){
			int count=0;
			while(arr[i]!=0){
				rem=arr[i]%10;
				count++;
				arr[i]/=10;
			}
			arrr[i]=Integer.toString(count);	
		}

		String str =String.join(",",arrr);
		System.out.println(str);

	}
}

