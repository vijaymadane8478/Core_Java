/*
 *
 * 1 2 3 4
 * 2 3 4 5
 * 3 4 5 6
 * 4 5 6 7
 *
 *
 * 1 2 3
 * 2 3 4
 * 3 4 5
 *
 *
 *
 */
import java.util.*;
class program10{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows: ");
		int rows = sc.nextInt();
		int num=1;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){ 
				System.out.print(num);
				num++;
			}
			System.out.println();
			num-=3;
		}
	}
}
