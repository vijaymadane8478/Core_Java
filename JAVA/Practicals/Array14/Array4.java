import java.util.*;
class Array4{
	public static void main(String[]args){

		Scanner sc= new Scanner(System.in);
		System.out.print("Enter size of Array: ");
		int arrSize=sc.nextInt();
		
		int arr[]= new int[arrSize];

		//user input
		
		for(int i=0;i<arr.length;i++){
			System.out.print("Enter ELement: ");
			arr[i]=sc.nextInt();
		}
		
		//printing elements
		System.out.println("Elements are: ");
		int sum=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==1){
				sum+=arr[i];
			}
		}
		System.out.println("Sum of odd elements in Array is: "+sum);
	}
}

