
/*        *  
 *      * *
 *    * * *
 *  * * * *
 */

import java.util.*;

class code{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter rows:");
		int rows= sc.nextInt();

		int cnt=rows;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=cnt-1;j++){
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
		cnt--;
		System.out.println();
		}
	}
}
 
