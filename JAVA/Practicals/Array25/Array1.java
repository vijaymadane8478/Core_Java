//add 15 in each arr elements
import java.util.*;
class Array1{
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
		System.out.println("After adding 15 to each elements:");
		for (int i=0;i<arr.length;i++){
			arr[i]+=15;
			System.out.println(" "+arr[i]);
		}
	}
}
