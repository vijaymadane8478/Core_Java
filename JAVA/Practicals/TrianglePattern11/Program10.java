/* 
 *  65 B 67 D
 *  B 67 D
 *  67 D
 *  D
 *
 */
import java.util.*;

class Program10{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows: ");
		int rows= sc.nextInt();
		char ch1='A';
		for(int i=1;i<=rows;i++){
			for(int j=i;j<=rows;j++){
				if((i%2==1 && j%2==1)||(i%2==0 && j%2==0)){
					System.out.print((int)(ch1)+" ");
					ch1++;
				}else{
					System.out.print((ch1)+ " ");
					ch1++;
				}

			}
		System.out.println();
		}
	}
}
