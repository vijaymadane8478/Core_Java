import java.util.*;

class program9{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the num1: ");
		int num1= sc.nextInt();
		System.out.println("Enter the num2: ");
		int num2= sc.nextInt();
	
		for(int i=num1;i<=num2;i++){
			if(i%2==0){
				System.out.print(i+" ");
			}		
		}
	}
}

