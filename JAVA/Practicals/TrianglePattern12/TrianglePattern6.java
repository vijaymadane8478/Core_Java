
/*
 * 1
 * B C
 * 1 2 3
 * G H I J
 */

import java.util.*;

class TrianglePattern6{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Rows: ");
		int rows= sc.nextInt();
		char ch='A';
		for(int i=1;i<=rows;i++){
			int num=1;
			for(int j=1;j<=i;j++){
				if(i%2==1){
					System.out.print(num+" ");
					num++;
					ch++;
				}else{
					System.out.print(ch+" ");
					ch++;
				}
			}
		System.out.println();
		}
	}
}

