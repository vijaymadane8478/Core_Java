/*
 * D C B A
 * c b a
 * B A
 * a
 */
import java.util.*;
class TrianglePattern10{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter row size");
		int rows= sc.nextInt();
		
		//char ch1='D';
		//char ch2='c';

		int num=4;
		for(int i=1;i<=rows;i++){
		char ch1='D';
		char ch2='c';
			for(int j=1;j<=num;j++){
				if(i%2==1){
					System.out.print(ch1+ " ");
					ch1--;
				}else{
					System.out.print(ch2+ " ");
					ch2--;
				}
			}
		num--;
		System.out.println();	
		}
	}
}
