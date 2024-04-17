/*
 *
 * 4 c 2 a
 * 3 b 1
 * 2 a
 * 1
 */
import java.util.*;
class TrianglePattern7{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows Size");
		int rows= sc.nextInt();
		
		int num1=4;
		char ch = 'a';
		
		int num2=4;
	
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=num2;j++){
				if(j%2!=0){
					System.out.print(num1+ " ");
					num1--;
				}else{
					System.out.print(ch+ " ");
					ch-=2;
				}
			}
		num1=4-i;
		num2--;
		System.out.println();
		}
	}
}

