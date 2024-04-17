/* 
 * 4 3 2 1
 * 4 3 2 1
 * 4 3 2 1 
 * 4 3 2 1
 * 
 */

class Pattern13{
	public static void main(String[]args){
		int rows=4;
		for(int i=1;i<=rows;i++){
			int num=4;
			for(int j=1;j<=rows;j++){
			System.out.print(num+ " ");
			num--;
			}
		System.out.println();
		}
	}
}	
