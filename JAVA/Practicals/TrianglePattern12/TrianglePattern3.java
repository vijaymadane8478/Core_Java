
/*
 * D
 * D C
 * D C B
 * D C B A
 */
import java.util.*;

class TrianglePattern3{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Rows: ");
		int rows= sc.nextInt();

		for(int i=1;i<=rows;i++){
			char ch='C';
			for(int j=1;j<=i;j++){
				System.out.print(ch+" ");
				ch--;
			}
		System.out.println();
		}
	}
}
