/*
 * 5
 * 5 a
 * 5 b 7
 * 5 c 7 8
 */
import java.util.*;
class TrianglePattern9{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the rows Size: ");
		int rows= sc.nextInt();
		

		char ch='a';
		
		for(int i=1;i<=rows;i++){
			int num=5;
			for(int j=1;j<=i;j++){
				
				if((i%2==1 && j%2==0)||(i%2==0 && j%2==0)){
					System.out.print(ch+" ");
					ch++;
					num++;
				}else{
				System.out.print(num+" ");
				num++;
				}
			}
		System.out.println();
		}
	}
}
