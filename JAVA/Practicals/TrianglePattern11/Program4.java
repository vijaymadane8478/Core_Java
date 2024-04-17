/* 
 *   4
 *   4 8
 *   4 8 12
 *   4 8 12 16
 *
 */
import java.util.*;

class Program4{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows: ");
		int rows= sc.nextInt();
		for(int i=1;i<=rows;i++){
			int num=4;
			for(int j=1;j<=i;j++){
				System.out.print(num+" ");
				num+=4;
			}	
		System.out.println();
		}
	}
}
