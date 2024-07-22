//reverse the given number;
import java.util.*;

class reversenum2{
	public static void main (String[]args){
	System.out.println("Hello World");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int num=sc.nextInt();

	int quotient=num;
	int rem=0;
	int sum=0;
	while(quotient!=0){
		rem=quotient%10;
		sum=sum*10+rem;
		quotient/=10;
	}
	System.out.println("reverse of "+num+" is "+sum);

}
}
