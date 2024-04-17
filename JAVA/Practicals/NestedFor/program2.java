/*
 *	1 2 3
 *	1 2 3
 *	1 2 3
 * 
 * */
import java.util.*;
class program2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number rows: ");
		int rows=sc.nextInt();
		System.out.println("rows"+rows);
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}


