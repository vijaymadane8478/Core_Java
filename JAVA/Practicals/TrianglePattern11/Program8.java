/* 
 *   1 2 3 4
 *   2 3 4
 *   3 4
 *   4
 *
 */
import java.util.*;

class Program8{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows: ");
		int rows= sc.nextInt();
		
		for(int i=1;i<=rows;i++){
			for(int j=i;j<=rows;j++){
				System.out.print(j+" ");
			}
		System.out.println();
		}
	}
}
