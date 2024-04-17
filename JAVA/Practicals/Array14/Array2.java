import java.util.*;
class Array2{
	public static void main(String[]args){
		
		int arr[]=new int[10];
		Scanner sc= new Scanner(System.in);

		//user input
		for(int i=0;i<arr.length;i++){
			System.out.print("Enter ELement: ");
			arr[i]=sc.nextInt();
		}
		//printing elements
		System.out.println("Elements are: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}

