/* 
 *   1
 *   1 2 
 *   1 2 3.
 *   1 2 3 4
 *
 */
import java.util.*;

class Program1{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows: ");
		int rows= sc.nextInt();

		for(int i=1;i<=rows;i++){
			int num=1;
			for(int j=1;j<=i;j++){
				System.out.print(num+" ");
				num++;
			}
		System.out.println();
		}
	}
}
