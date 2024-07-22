
/*         1
 *       1 2 
 *     1 2 3
 *   1 2 3 4 
 */  

import java.util.*;

class program1{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter rows:");
		int rows= sc.nextInt();

		int cnt=rows;
	
		for(int i=1;i<=rows;i++)
		{
			int num=1;

			for(int j=1;j<=cnt-1;j++){
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++){
				System.out.print(num+"");
				num++;
			}
		cnt--;
		System.out.println();
		}
	}
}
 
