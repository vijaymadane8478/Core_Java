//print sum of prime number in array
//count prime number array

import java.util.*;

class Array2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int arrSize = sc.nextInt();

		int arr[] = new int[arrSize];

		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		int sum = 0;
		int count2=0;

		for(int i=0;i<arr.length;i++){
			int count1=0;
			for(int j=1;j<arr[i];j++){
				if(arr[i]%j==0){
					count1++;
				}
			}
			if(count1==2){
			sum+=arr[i];
			count2++;
			}	
		}

		System.out.println("sum of prime number is" +sum);
		System.out.println("prime number are" +count2);

	}
}

