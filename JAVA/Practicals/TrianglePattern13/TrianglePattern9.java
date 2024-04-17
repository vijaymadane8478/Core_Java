import java.util.*;

class TrianglePattern9{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Row Size");
		int rows=sc.nextInt();

		int numprint=19;
		int num=4;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=num;j++){
				System.out.print(numprint+" ");
				numprint-=2;
			}
		num--;
		System.out.println();
		}
	}
}
