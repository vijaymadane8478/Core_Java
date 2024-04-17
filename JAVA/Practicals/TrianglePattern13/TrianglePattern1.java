/*
 *
 * 1 2 3 4
 * 2 3 4
 * 3 4 
 * 4
 */
import java.util.*;
class TrianglePattern1{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows Size");
		int rows= sc.nextInt();
		
		int num1=1;
		int num2=4;
	
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=num2;j++){
				System.out.print(num1+" ");
				num1++;
			}
		num1=i+1;
		num2--;
		System.out.println();
		}
	}
}

