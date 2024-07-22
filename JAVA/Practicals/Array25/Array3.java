//find number occerance of specific number in element in array
//print count of occerance
import java.util.*;
class Array3{
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
		int count=0;

		for (int i=0;i<arr.length;i++){
			if(spcnum==arr[i]){
				count++;	
			}
		}
		if (count>0){
			System.out.println(spcnum+" is "+count+ "time is the array");
			}else{
				System.out.println(spcnum+ "Not found");
			}

		}

}
