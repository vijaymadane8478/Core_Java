/*
 * row = 4
 * 4
 * 3 6
 * 2 4 6
 * 1 2 3 4
 */
import java.util.*;

class program4{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of rows: ");
	
		int rows= sc.nextInt();
		int num=4;
	
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print(num*j +" ");
			}
		num--;
		System.out.println();
		}
	}
}
