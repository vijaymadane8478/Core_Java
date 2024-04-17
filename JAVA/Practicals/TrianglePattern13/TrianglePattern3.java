/*
 *
 *  20 18 16 14
 *  12 10 8
 *  6 4
 *  2
 */
import java.util.*;
class TrianglePattern3{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows Size");
		int rows= sc.nextInt();
		
		int num1=20;
		int num2=4;
	
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=num2;j++){
				System.out.print(num1+" ");
				num1-=2;
			}
		num2--;
		System.out.println();
		}
	}
}

