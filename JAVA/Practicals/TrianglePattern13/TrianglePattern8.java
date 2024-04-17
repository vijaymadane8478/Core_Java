/*
 *
 * 4 3 2 1
 * C B A
 * 2 1
 * A
 */
import java.util.*;
class TrianglePattern8{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows Size");
		int rows= sc.nextInt();
		
		int num1=4;
		char ch = 'C';
		
		int num2=4;
	
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=num2;j++){
				if(i%2!=0){
					System.out.print(num1+ " ");
					num1--;
				}else{
					System.out.print(ch+ " ");
					ch--;
				}
			}
		num2--;
		num1+=2;
		System.out.println();
		}

	}
}

