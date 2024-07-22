
/* 
 *  * * * *
 *    * * *
 *      * *
 *        *
 * 
 */

import java.util.*;

class code2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows : ");
		int rows=sc.nextInt();
		
		int cnt=rows;
		for(int i=rows;i>=1;i--){
			
			for(int j=rows;j>i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("*");
			}
		cnt--;
		System.out.println();
		}
	}
}
