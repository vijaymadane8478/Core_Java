/* 
 * 1 2 3
 * 1 2 3
 * 1 2 3
 * 
 */

class Pattern11{
	public static void main(String[]args){
		int rows=3;
		for(int i=1;i<=rows;i++){
			int num=1;
			for(int j=1;j<=rows;j++){
			System.out.print(num+ " ");
			num++;
			}
		System.out.println();
		}
	}
}	
