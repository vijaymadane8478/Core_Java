/*
 *
 * 1 2 3 4
 * 4 5 6 7
 * 7 8 9 10
 * 10 11 12 13
 *
 * 1 2 3
 * 3 4 5
 * 5 6 7
 *
 *
 *
 */
import java.util.*;
class program9{
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
			num-=1;
		}
	}
}
