/* 
 *   * * * *
 *   * * *
 *   * *
 *   *
 *
 */
import java.util.*;

class StarPattern2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows: ");
		int rows= sc.nextInt();
		int num=4;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=num;j++){
				System.out.print("*"+" ");
			}
		num--;	
		System.out.println();
		}
	}
}
