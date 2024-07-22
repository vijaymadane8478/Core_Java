//print the composite numer from arrary
import java.util.*;
class Array8{
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
			int j=arr[i];
			int count=0;
			while(j>0){
				if(arr[i]%j==0){
					count++;
				}
				j--;
			}
			if(count==2){
				continue;
			}else{
				System.out.print(arr[i]+" ");
			}
		}
		}

}

