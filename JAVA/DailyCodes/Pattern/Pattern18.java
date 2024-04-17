/* 
 * 1 2 3 4
 * 4 3 2 1
 * 1 2 3 4
 * 4 3 2 1
 * 1 2 3 4
 * 4 3 2 1
 * 
 */

class Pattern18{
	public static void main(String[]args){
		int rows=4;
		for(int i=1;i<=rows;i++){
			int num1=1;
			int num2=4;
			for(int j=1;j<=4;j++){
				if(i%2==1){
					System.out.print(num1+" ");
					num1++;
				}else{
					System.out.print(num2+" ");
					num2--;
				}
			}
		System.out.println();
		}
	}
}	
