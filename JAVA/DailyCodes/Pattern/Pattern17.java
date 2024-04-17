/* 
 *  1 2 3
 *  D E F
 *  4 5 6 
 * 
 */

class Pattern17{
	public static void main(String[]args){
		int rows=3;
		int num=1;
		char ch='D';
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=3;j++){
				if(i%2==1){
					System.out.print(num+ " ");
					num++;
				}else{
					System.out.print(ch+" ");
					ch++;
				}

			}
		System.out.println();
		}
	}
}	
