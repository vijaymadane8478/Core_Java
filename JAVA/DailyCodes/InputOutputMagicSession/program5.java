import java.util.*;

class program5{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num: ");
		int num= sc.nextInt();
		if(num<=160){
			if(num%16==0){
				System.out.println(num+ "is present in table of 16");
			}else{
				System.out.println(num+ "is Not present in table of 16");
			}
		}else{
			System.out.println("Enter valid number:");
		}

	}
}

