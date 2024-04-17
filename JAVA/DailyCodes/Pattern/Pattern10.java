/* 
 * 1 2 3
 * 4 5 6
 * 7 8 9
 */

class Pattern10{
	public static void main(String[]args){
		int rows=3;
		int num=1;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
			System.out.print(num+ " ");
			num++;
			}
		System.out.println();
		}
	}
}	
