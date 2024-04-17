/*
 *
 *   1 a 2 b
 *   1 a 2
 *   1 a
 *   1
 */
import java.util.*;
class TrianglePattern6{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows Size");
		int rows= sc.nextInt();
		
	
		int num2=4;
	
		for(int i=1;i<=rows;i++){
	        int num=1;
		char ch2='a';
			for(int j=1;j<=num2;j++){
				if((i%2==1 && j%2==1)||(i%2==0&j%2==1)){
					System.out.print(num+" ");
					num++;
				}else{
					System.out.print(ch2+" ");
					ch2++;
				}		
			}
		num2--;
		System.out.println();
		}
	}
}

