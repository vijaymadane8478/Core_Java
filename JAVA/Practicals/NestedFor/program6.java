/*
 * 1A 2B 3C
 * 1A 2B 3C
 * 1A 2B 3c
 *
 * */
import java.util.*;
class program6{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of rows: ");
		int rows= sc.nextInt();

		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				System.out.print(j+""+(char)(j+64)+" ");
			}
			System.out.println();
		}
	}
}
