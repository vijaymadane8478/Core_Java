/*
 *
 97 98 99
 97 98 99
 97 98 99
 *
 */
// by typecasting the char into int  we havae changed the behavior to char
class NestedDemo14{
	public static void main(String[]args){
		for(int i=1;i<=3;i++){
			char ch='a';
			for(int j=1;j<=3;j++){ 
				System.out.print((int)ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}
