import java.util.*;
class Demo11{
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name: ");
		String name=sc.next(); 
		
		System.out.println("Enter College Name: "); 
		String clgname=sc.next();

		System.out.println("Enter Stu Id: "); 
		int stuid=sc.nextInt(); 
		
		System.out.println("Enter Marks: "); 
		float marks=sc.nextFloat(); 

		System.out.println("Name: " +name);
		System.out.println("clg name: " +clgname);
		System.out.println("stu id: " +stuid);
		System.out.println("marks: " +marks);
	}
}
