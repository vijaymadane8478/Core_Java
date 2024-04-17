/* 
 *   A
 *   B C
 *   C D E
 *   D E F G
 *
 */
import java.util.*;

class Program3{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows: ");
		int rows= sc.nextInt();
		char ch='A';
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print(ch +" ");
				ch++;
			}	
		System.out.println();
		}
	}
}
