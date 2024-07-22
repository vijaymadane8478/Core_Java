
/* 
 *  4 4 4 4 
 *    3 3 3
 *      2 2 
 *        1
 * 
 */

import java.util.*;

class program6{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows : ");
		int rows=sc.nextInt();
		
		int num=rows;

		for(int i=rows;i>=1;i--){
			
			for(int j=rows;j>i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print(num+"");
			}
		num--;
		System.out.println();
		}
	}
}
