//user input
//count vowels in arrray
//cont constant in array

import java.util.*;

class Array6{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int arrSize = sc.nextInt();

		char arr[] = new char[arrSize];
			
	
		//input
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter Element: ");
			arr[i]=sc.next().charAt(0);
		}
		
		int Vcount=0;
		int Ccount=0;

		for(int i=0;i<arr.length;i++){
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' ||arr[i]=='u'){
				Vcount++;
			}else{
				Ccount++;
			}
		}
		System.out.println("Vowels Are: " +Vcount );
		System.out.println("Constants Are: "+Ccount );}
		
		
}

