import java.util.*;

class program8{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the num1: ");
		int num1= sc.nextInt();
		System.out.println("Enter the num2: ");
		int num2= sc.nextInt();
		int sum=0;
		for(int i=num1;i<=num2;i++){
			sum=sum+i;
		}
		System.out.println("Sum of number in range "+num1+" to "+num2+": "+sum);
	}
}

