/*
 * row = 4
 * 1
 * 2 4
 * 3 6 9
 * 4 8 12 16
 */
import java.util.*;

class program5{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of rows: ");
	
		int rows= sc.nextInt();
		int num=1;
	
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print(num*j +" ");
			}
		num++;
		System.out.println();
		}
	}
}
