
/*         D 
 *        CD 
 *       BCD
 *      ABCD
 *
 */

import java.util.*;

class program3{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter rows:");
		int rows= sc.nextInt();

		int cnt=rows;
		
		char ch='D';
	

		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=cnt-1;j++){
				System.out.print(" ");
			}
			int j=1;
			for(j=1;j<=i;j++){
				System.out.print(ch+"");
				ch++;
			}
		ch-=j;
		cnt--;
		System.out.println();
		}
	}
}
 
