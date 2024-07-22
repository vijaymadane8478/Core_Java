/*
 * row=3 
 * C3 C2 C1
 * C4 C3 C2
 * C5 C4 C3
 *
 * ROW=4 
 *
 * D4 D3 D2 D1
 * D5 D4 D3 D2
 * D6 D5 D4 D3
 * D7 D6 D5 D4
 */
import java.util.*;

class program2{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of rows: ");
		int rows= sc.nextInt();
		
		char ch='D';
		System.out.println(ch);

		int num=4;

		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				System.out.print(ch+""+num+" ");
				num--;
			}
		System.out.println();
		num+=5;
		}
	}
}
