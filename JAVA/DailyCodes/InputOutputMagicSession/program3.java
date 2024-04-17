import java.util.*;

class program3{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num= sc.nextInt();
		if(num%8==0){
			System.out.println(num+" is a divisible by 8");
		}else{
			System.out.println(num+" not is a divisible by 8");
		}
	}
}
