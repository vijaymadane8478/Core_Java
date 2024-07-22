/*
 * C B A
 * 1 2 3
 * C B A
 *
 * D C B A
 * 1 2 3 4
 * D C B A 
 * 1 2 3 4
 */
import java.util.*;

class program3{
	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of rows: ");
	
		int rows= sc.nextInt();
	
		//int num=1;
		//char ch='D';
	
		for(int i=1;i<=rows;i++){

		int num=1;
		char ch='D';
			for(int j=1;j<=rows;j++){
				if(i%2!=0){
					System.out.print(num+" ");
					num++;
				}else{
					System.out.print(ch+" ");
					ch--;
				}
			}
		System.out.println();
		}
	}
}
