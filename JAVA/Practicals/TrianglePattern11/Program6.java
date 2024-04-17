/* 
 *   4 4 4 4
 *   3 3 3 
 *   2 2 2
 *   1
 *
 */
import java.util.*;

class Program6{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows: ");
		int rows= sc.nextInt();
		int num=4;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=num;j++){
				System.out.print(num+" ");
			}
		num--;	
		System.out.println();
		}
	}
}
