
import java.util.*;

class ArrayDemo9{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size= sc.nextInt();

		int arr[]= new int[size];
		System.out.println("Size of Array is: "+arr.length);

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Elements are: ");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}

		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}

		System.out.println("sum of array is: "+sum);

	}
}
