import java.util.*;

class program2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age: ");
		int age= sc.nextInt();
		if(age>0){
			if(age>=18){
				System.out.println("Eligible for Voting");
			}else{
				System.out.println("Not Eligible for Voting");
			}
		}else{
			System.out.println("Enter valid number:");
		}

	}
}

