/*
 *
 * C1 C2 C3
 * C4 C5 C6
 * C7 C8 C9
 *
 * D1 D2 D3 D4
 * D5 D6 D7 D8
 * D9 D10 D11 D12
 * D13 D14 S15 D16
 */
import java.util.*;
class program8{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows: ");
		int rows = sc.nextInt();
		//int num=1;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){ 
				System.out.print('C'+((i-1)*rows+j+" "));
			}
			System.out.println();
		}
	}
}
