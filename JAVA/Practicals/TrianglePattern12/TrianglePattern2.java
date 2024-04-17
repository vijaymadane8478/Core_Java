
/*
 * a
 * $ $
 * a b c 
 * $ $ $ $ 
 */

import java.util.*;

class TrianglePattern2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Rows: ");
		int rows= sc.nextInt();

		for(int i=1;i<=rows;i++){
			char ch='a';
			for(int j=1;j<=i;j++){
				if(i%2==1){
					System.out.print(ch+" ");
					ch++;
				}else{
					System.out.print("$"+" ");
				}
			}
		System.out.println();
		}
	}
}
