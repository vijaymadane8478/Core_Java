/*
 *  1 1 1
 *  2 2 2 
 *  3 3 3 
 *
 *  1 1 1 1 
 *  2 2 2 2 
 *  3 3 3 3
 *  4 4 4 4
 */
import java.util.*;
class program3{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number rows: ");
		int rows=sc.nextInt();
		System.out.println("rows"+rows);
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}


