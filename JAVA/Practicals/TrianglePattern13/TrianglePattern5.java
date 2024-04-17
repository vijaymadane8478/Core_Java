/*
 *
 *   A B C D
 *   a b c 
 *   A B
 *   a
 */
import java.util.*;
class TrianglePattern5{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows Size");
		int rows= sc.nextInt();
		
	
		int num2=4;
	
		for(int i=1;i<=rows;i++){
		char ch1='A';
		char ch2='a';
			for(int j=1;j<=num2;j++){
				if(i%2==1){
					System.out.print(ch1+" ");
					ch1++;
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

