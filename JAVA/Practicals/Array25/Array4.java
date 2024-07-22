//convert all even to 0 and odd to 1 in arra
import java.util.*;
class Array4{
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
			if(arr[i]%2==0){
				arr[i]=0;
			}else{
				arr[i]=1;
			}

		}
		for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
		}
	}
}
