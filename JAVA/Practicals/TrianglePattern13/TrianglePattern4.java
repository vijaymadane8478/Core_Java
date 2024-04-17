/*
 *
 *  J I H G
 *  F E D
 *  C B
 *  A
 */
import java.util.*;
class TrianglePattern4{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows Size");
		int rows= sc.nextInt();
		
		char ch='J';
		int num2=4;
	
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=num2;j++){
				System.out.print(ch+" ");
				ch--;
			}
		num2--;
		System.out.println();
		}
	}
}

