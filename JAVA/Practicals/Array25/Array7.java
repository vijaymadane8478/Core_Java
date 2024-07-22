//check size of array
//if array size is odd and greter than 5 print odd element
//if array size is even adn greter than 5 print even number;
import java.util.*;
class Array7{
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
			if(arrSize%2 == 1 && arrSize>=5){
				if(arr[i]%2==1){
					System.out.println(arr[i]+" ");
				}
			
			}else{
				if(arr[i]%2==0){
				System.out.println(arr[i]);
				}
			}
		}
		}

}

