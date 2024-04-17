/* 
 *   E D C B A
 *   E D C B
 *   E D C 
 *   E D
 *   E
 *
 */
import java.util.*;

class Program9{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows: ");
		int rows= sc.nextInt();
		int num=5;
		for(int i=1;i<=rows;i++){
			char ch='E';
			for(int j=1;j<=num;j++){
				System.out.print(ch+" ");
				ch--;
			}
		num--;
		System.out.println();
		}
	}
}
