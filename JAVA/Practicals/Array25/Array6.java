//print constant in charater array not vowels
import java.util.*;
class Array6{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Size of Array:");
		int arrSize=sc.nextInt();

		char arr[]=new char[arrSize];
		System.out.println("Enter Array Elements: ");
	
		//input
		for (int i=0;i<arr.length;i++){
			arr[i]=sc.next().charAt(0);
		}
	
		//print
		for (int i=0;i<arr.length;i++){
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='o'){
				continue;
			}else{
				System.out.print(arr[i]+" ");
			}
		}
	}
}

