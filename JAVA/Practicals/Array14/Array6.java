import java.util.*;
class Array6{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size of Array: ");
		int arrSize=sc.nextInt();

		char arr[]=new char[arrSize];

		for(int i=0;i<arr.length;i++){
			System.out.println("Enter character: ");
			arr[i]=sc.nextChar();
		}
	}
}
