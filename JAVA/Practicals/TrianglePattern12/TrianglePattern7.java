/*
 * 1
 * 2 a
 * 3 b 3
 * 4 c 4 d
 */
import java.util.*;
class TrianglePattern7{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the rows Size: ");
		int rows= sc.nextInt();
		
		int num=1;

		char ch='a';
		
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				if((i%2==1 && j%2==0)||(i%2==0 && j%2==0)){
					System.out.print(ch+" ");
					ch++;
				}else{
				System.out.print(num+ " ");
				}
			}
		num++;
		System.out.println();
		}
	}
}
