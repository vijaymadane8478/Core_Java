
/*
 * 1
 * b c
 * 4 5 6
 * g h i j
 *
 */

import java.util.*;

class TrianglePattern10{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Rows: ");
		int rows= sc.nextInt();
		
		int num=1;
		char ch='a';

		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				if(i%2==1){
					System.out.print(num+" ");
					num++;
					ch++;
				}else{
					System.out.print(ch+" ");
					ch++;
					num++;
				}
			}
		System.out.println();
		}
	}
}
