/*
 * A C E
 * G I K
 * M O Q
 *
 */
import java.util.*;

class program4{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of rows: ");
		int rows=sc.nextInt();
		char ch='A';
		for (int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				System.out.print(ch+ " ");
				ch+=2;
			}
			System.out.println();
		}
	}
}
