import java.util.*;
class Demo5{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Num1 : ");
		//String cannot convert to int
		int num= sc.next();
		System.err.println("Number: "+num);
	}
}
