/*
 *
 a b c 
 a b c
 a b c
 *
 */
// by typecasting the integer into char we havae changed the behavior to char
class NestedDemo13{
	public static void main(String[]args){
		for(int i=1;i<=3;i++){
			int ch=97;
			for(int j=1;j<=3;j++){ 
				System.out.print((char)ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}
