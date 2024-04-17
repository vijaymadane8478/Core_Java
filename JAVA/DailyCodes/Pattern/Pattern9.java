//A b C d E f G h I
class Pattern9{
	public static void main(String[]args){
		int num=10;
		char ch1='A';
		char ch2='a';
		for(int i=1;i<=num;i++){
			if(i%2==1){
				System.out.print(ch1+" ");
				ch1+=2;
			}else{
				System.out.print(ch2++ +" ");
				ch2+=2;

			}
		}
	System.out.println();
	}
}
