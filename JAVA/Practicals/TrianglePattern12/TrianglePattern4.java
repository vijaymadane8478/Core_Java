
/*
 * d
 * D C
 * d c b
 * D C B A 
 */

import java.util.*;

class TrianglePattern4{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Rows: ");
		int rows= sc.nextInt();

		for(int i=1;i<=rows;i++){
			char ch1='d';
			char ch2='D';
			for(int j=1;j<=i;j++){
				if(i%2==1){
					System.out.print(ch1+" ");
					ch1--;
				}else{
					System.out.print(ch2+" ");
					ch2--;
				}
			}
		System.out.println();
		}
	}
}

