import java.util.*;

class program7{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the num1: ");
		int num= sc.nextInt();

		for(int i=10;i>=1;i--){
			System.out.print(num+"*"+i+"="+num*i+" ");
		}
	}
}

