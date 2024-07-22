/*
 * 
 * row=4
 *  J I H G
 *  F E D
 *  C B 
 *  A
 */
import java.util.*;

class program8{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of rows: ");
		int rows= sc.nextInt();

		char ch='J';
		int cnt=4;

		for(int i=1;i<=rows;i++){
			for(int j=1;j<=cnt;j++){
				System.out.print(ch+" ");
				ch--;
			}
		cnt--;
		System.out.println();
		}
	}
}
