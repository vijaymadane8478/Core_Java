import java.util.*;
class Demo9{
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name: ");
		String name=sc.next(); 
		
		System.out.println("Enter College Name: "); 
		String clgname=sc.next();

		System.out.println("Enter Stu Id: "); 
		int stuid=sc.next(); 
		
		System.out.println("Enter Marks: "); 
		int marks=sc.next(); //String cannot convert to float     
	}
}
