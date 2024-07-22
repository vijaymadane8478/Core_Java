/*
 * 
 * row=4
 * 2 4 6 8
 * 10 12 14
 * 16 18
 * 20
 *
 */
import java.util.*;

class program7{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of rows: ");
		int rows= sc.nextInt();

		int num=2;
		int cnt=4;

		for(int i=1;i<=rows;i++){
			for(int j=1;j<=cnt;j++){
				System.out.print(num+" ");
				num+=2;
			}
		cnt--;
		System.out.println();
		}
	}
}
