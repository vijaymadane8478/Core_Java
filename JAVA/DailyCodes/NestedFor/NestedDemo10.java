/*
 *
 1 2 3 
 1 2 3
 1 2 3
 *
 */
class NestedDemo10{
	public static void main(String[]args){
		for(int i=1;i<=3;i++){
			int num=1;
			for(int j=1;j<=3;j++){ 
				System.out.print(j+" ");
				num++;
			}
			System.out.println();
		}
	}
}
