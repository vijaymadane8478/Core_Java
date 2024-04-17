/* 
 *   1
 *   2 4
 *   3 6 9
 *   4 8 12 16
 *
 */
import java.util.*;

class Program5{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows: ");
		int rows= sc.nextInt();
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i*j+" ");

			}	
		System.out.println();
		}
	}
}
