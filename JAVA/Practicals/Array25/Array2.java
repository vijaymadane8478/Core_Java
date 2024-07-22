//add first occerance of specific number in element in array
import java.util.*;
class Array2{
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
		System.out.println("specific number :");
		int spcnum=sc.nextInt();

		for (int i=0;i<arr.length;i++){
			if(spcnum==arr[i]){
				System.out.println(spcnum+"is occered at index "+i);
				break;
			}

			if(spcnum!=arr[i]){
				System.out.println("Not found");
				break;
			}

		}
	}
}
