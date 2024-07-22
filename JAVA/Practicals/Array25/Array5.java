//convert all negative number to squre in array
import java.util.*;
class Array5{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Size of Array:");
		int arrSize=sc.nextInt();

		int arr[]=new int[arrSize];
		System.out.println("Enter Array Elements: ");
	
		//input
		for (int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
	
		//print
		for (int i=0;i<arr.length;i++){
			if(arr[i]<0){
				arr[i]=arr[i]*arr[i];
			}
		}

		for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
		}
	}
}

