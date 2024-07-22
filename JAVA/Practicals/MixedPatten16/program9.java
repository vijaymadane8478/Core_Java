/*
 * 
 * row=4
 * 1 2 3 4
 * C B A
 * 1 2
 * C
 *
 */
import java.util.*;

class program9{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of rows: ");
		int rows= sc.nextInt();

		int cnt=4;

		for(int i=1;i<=rows;i++){
		
			int num=1;
			char ch='C';

			for(int j=1;j<=cnt;j++){
				if(i%2!=0){
					System.out.print(num+" ");
					num++;
				}else{
					System.out.print(ch+" ");
					ch--;
				}
			}
		cnt--;
		System.out.println();
		}
	}
}
