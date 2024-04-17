import java.util.*;

class program1{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num= sc.nextInt();
		if(num%2==1){
			System.out.println(num+" is a odd number");
		}else{
			System.out.println(num+" is a even number");
		}
	}
}
