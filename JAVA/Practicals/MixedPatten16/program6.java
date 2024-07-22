/*
 * row=4
 * d
 * 4 3
 * d c b
 * 4 3 2 1
 *
 * */
import java.util.*;

class program6{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of rows: ");
	
		int rows= sc.nextInt();
		
	
		for(int i=1;i<=rows;i++){

			int num=4;
			char ch='d';
			
			for(int j=1;j<=i;j++){
							
				if(i%2!=0){
					System.out.print(ch+" ");
					ch--;
				}else{
					System.out.print(num+" ");
					num--;
				}
			}
		System.out.println();
		}
	}
}
