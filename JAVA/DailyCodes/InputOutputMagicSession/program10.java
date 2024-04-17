import java.util.*;

class program10{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Marks of Maths: ");
		int maths= sc.nextInt();
	
		System.out.println("Enter Marks of English: ");
		int english= sc.nextInt();

		System.out.println("Enter Marks of Science: ");
		int science= sc.nextInt();

		System.out.println("Enter Marks of marathi: ");
		int marathi= sc.nextInt();
		
		int sum =0;
		if(maths<=100 && english<=100 && science<=100 && marathi<=100){
			sum=maths+english+science+marathi;
			System.out.println(sum+" out of 400");
		}else{
			System.out.println("Enter valid marks");
		}
	}
}
			
