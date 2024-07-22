
/* 
 *  1 2 3 4
 *    2 3 4
 *      3 4
 *        4
 * 
 */

import java.util.*;

class program8{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows : ");
		int rows=sc.nextInt();
		
		int num=1;

		for(int i=rows;i>=1;i--){

			for(int j=rows;j>i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print(num++ +"");
			}
		num-=3;
		System.out.println();
		}
	}
}
