//9 B 7 D 5 F 3 H 1
class Pattern8{
	public static void main(String[]args){
		int num=1;
		char ch='A';
		for(int i=10;i>=num;i--){
			if(i%2==1){
				System.out.print(i+" ");
			}else{
				System.out.print(ch++ +" ");
			}
		}
	System.out.println();
	}
}
