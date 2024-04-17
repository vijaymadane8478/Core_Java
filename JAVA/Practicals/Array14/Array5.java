import java.util.*;
class Array5{
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
		for(int i=0;i<arr.length;i++){
			if(arr[i]<10){
				System.out.println(arr[i]+" is less than 10" );
			}
		}
	}
}

