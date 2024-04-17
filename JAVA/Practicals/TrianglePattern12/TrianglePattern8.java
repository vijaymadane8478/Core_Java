/*
 * 1
 * 1 e
 * 1 c 3 
 * 1 g 3 i
 */
import java.util.*;
class TrianglePattern8{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the rows Size: ");
		int rows= sc.nextInt();
		

		char ch='c';
		
		for(int i=1;i<=rows;i++){
			int num=1;
			for(int j=1;j<=i;j++){
				
				if((i%2==1 && j%2==0)||(i%2==0 && j%2==0)){
					System.out.print(ch+" ");
					ch++;
				}else{
				System.out.print(num+ " ");
				num++;
				}
			}
		System.out.println();
		}
	}
}
