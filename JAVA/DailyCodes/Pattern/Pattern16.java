/* 
 *  1 B 3
 *  D 5 F
 *  7 H 9 
 * 
 */

class Pattern16{
	public static void main(String[]args){
		int rows=3;
		int num=1;
		char ch='B';
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=3;j++){
				if((i==1 && j%2==0) || (i==2 && j%2!=0) || (i==3 && j%2==0)){
					System.out.print(ch+" ");
					ch+=2;
				}else{
					System.out.print(num+" ");
					num+=2;
				}
			}
		System.out.println();
		}
	}
}	
