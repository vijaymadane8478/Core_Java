/*
 *
 1 2 3
 A B C
 4 5 6
 D E F
 *
 */
// by typecasting the char into int  we havae changed the behavior to char
class NestedDemo15{
	public static void main(String[]args){
		int num = 1 ;
		char ch ='A';
		for(int i=1;i<=4;i++){
			for(int j=1;j<=3;j++){ 
				if(i%2==0){
					System.out.print(ch++ +" ");
				}else{
					System.out.print(num++ +" ");
				}

			}
			System.out.println();
		}
	}
}
