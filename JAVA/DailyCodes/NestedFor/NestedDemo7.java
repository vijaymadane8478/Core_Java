/*
 *
 4 5 6
 7 8 9
 10 11 12
 */
class NestedDemo7{
	public static void main(String[]args){
		int num=4;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){ 
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}
