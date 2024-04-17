/*
 * E
 * F G
 * H I J
 * K L M N
 */

import java.util.*;

class TrianglePattern5{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Rows: ");
		int rows= sc.nextInt();
		char ch='E';
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print(ch+" " );
				ch++;
			}
		System.out.println();
		}
	}
}
